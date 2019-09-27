package com.lambdaschool.starthere.controllers;

import com.lambdaschool.starthere.models.ErrorDetail;
import com.lambdaschool.starthere.models.User;
import com.lambdaschool.starthere.models.UserAddress;
import com.lambdaschool.starthere.services.UserAddressService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/address")
public class UserAddressController
{
    @Autowired
    private UserAddressService userAddressService;

    @ApiOperation(value = "Retrieve Rental Associated with the Provided User", response = UserAddress.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "User Address Found", response = UserAddress.class),
            @ApiResponse(code = 404, message = "User Address Not Found", response = ErrorDetail.class)
    })
    @GetMapping(value = "/{user}",
            produces = {"application/json"})
    public ResponseEntity<?> getAddressByUser(
            @ApiParam(value = "User", required = true, example = "Some User")
            @PathVariable
                    User user)
    {
        UserAddress a = userAddressService.getAddressByUser(user);
        return new ResponseEntity<>(a, HttpStatus.OK);
    }

    @ApiOperation(value = "Creates a New User Address", notes = "Newly Created User Address Id Sent In Response Header",
            response =
            void.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Tool Successfully Created", response = void.class),
            @ApiResponse(code = 500, message = "Error Creating Tool", response = ErrorDetail.class)
    })
    @PostMapping(value = "/add",
            consumes = {"application/json"},
            produces = {"application/json"})
    public ResponseEntity<?> addNewAddress(@Valid
                                        @RequestBody
                                                UserAddress newAddress) throws URISyntaxException
    {
        newAddress = userAddressService.saveAddress(newAddress);

        HttpHeaders responseHeaders = new HttpHeaders();

        URI newAddressURI =
                ServletUriComponentsBuilder.fromCurrentRequest().path("/{user}").buildAndExpand(newAddress.getUser()).toUri();
        responseHeaders.setLocation(newAddressURI);

        return new ResponseEntity<>(null, responseHeaders, HttpStatus.CREATED);
    }

    @ApiOperation(value = "Updates the information for an address associated with the corresponding userId", response =
            void.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Address Updated Successfully", response = void.class),
    })
    @PutMapping(value = "/update/{userId}", produces = {"application/json"}, consumes = {"application/json"})
    public ResponseEntity<?> updateAddress(
            @RequestBody
                    UserAddress updateAddress,
            @ApiParam(value = "User Id", required = true, example = "1")
            @PathVariable
                    long userId)
    {
        userAddressService.updateAddress(updateAddress, userId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

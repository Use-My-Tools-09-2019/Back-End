package com.lambdaschool.starthere.controllers;

import com.lambdaschool.starthere.models.ErrorDetail;
import com.lambdaschool.starthere.models.Rental;
import com.lambdaschool.starthere.models.User;
import com.lambdaschool.starthere.services.RentalService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

@RestController
@RequestMapping(value = "/rentals")
public class RentalController
{
    @Autowired
    private RentalService rentalService;

    @ApiOperation(value = "Return all Rentals using Paging and Sorting", response = Rental.class, responseContainer =
            "ArrayList")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", dataType = "integer", paramType = "query", value = "Results page you " +
                    "want to retrieve (0..N)"),
            @ApiImplicitParam(name = "size", dataType = "integer", paramType = "query", value = "Number of records " +
                    "per page."),
            @ApiImplicitParam(name = "sort", allowMultiple = true, dataType = "string", paramType = "query", value =
                    "Sorting criteria in the format: property(,asc|desc). " + "Default sort order is ascending. " +
                            "Multiple sort criteria are supported.")
    })
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @GetMapping(value = "/rentals",
            produces = {"application/json"})
    public ResponseEntity<?> listAllRentals(
            @PageableDefault(page = 0,
                    size = 5)
                    Pageable pageable)
    {
        ArrayList<Rental> myRentals = rentalService.listAllRentals(pageable);
        return new ResponseEntity<>(myRentals, HttpStatus.OK);
    }

    @ApiOperation(value = "Retrieve Rental Associated with the Provided Rental Id", response = Rental.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Rental Found", response = Rental.class),
            @ApiResponse(code = 404, message = "Rental Not Found", response = ErrorDetail.class)
    })
    @GetMapping(value = "/rental/{rentalId}",
            produces = {"application/json"})
    public ResponseEntity<?> getRentalById(
            @ApiParam(value = "Rental Id", required = true, example = "1")
            @PathVariable
                    Long rentalId)
    {
        Rental r = rentalService.findRentalById(rentalId);
        return new ResponseEntity<>(r, HttpStatus.OK);
    }

    @ApiOperation(value = "Retrieve Rental Associated with the Provided User", response = Rental.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Rental Found", response = Rental.class),
            @ApiResponse(code = 404, message = "Rental Not Found", response = ErrorDetail.class)
    })
    @GetMapping(value = "/rental/{user}",
            produces = {"application/json"})
    public ResponseEntity<?> listRentalsByUser(
            @ApiParam(value = "User", required = true, example = "Some User")
            @PathVariable
                    User user)
    {
        ArrayList<Rental> myRentals = rentalService.findRentalsByUser(user);
        return new ResponseEntity<>(myRentals, HttpStatus.OK);
    }

    @ApiOperation(value = "Creates a New Rental",
            notes = "Newly Created Rental Id Sent In Response Header",
            response = void.class)
    @ApiResponses(value = {@ApiResponse(code = 200,
            message = "Rental Successfully Created",
            response = void.class), @ApiResponse(code = 500,
            message = "Error Creating Rental",
            response = ErrorDetail.class)})
    @PostMapping(value = "/rental/add",
            consumes = {"application/json"},
            produces = {"application/json"})
    public ResponseEntity<?> addNewTool(@Valid
                                        @RequestBody
                                                Rental newRental) throws URISyntaxException
    {
        newRental = rentalService.saveRental(newRental);

        HttpHeaders responseHeaders = new HttpHeaders();

        URI newRentalURI =
                ServletUriComponentsBuilder.fromCurrentRequest().path("/{rentalId}").buildAndExpand(newRental.getrentalid()).toUri();
        responseHeaders.setLocation(newRentalURI);

        return new ResponseEntity<>(null, responseHeaders, HttpStatus.CREATED);
    }
}

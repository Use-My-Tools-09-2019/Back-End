package com.lambdaschool.starthere.controllers;

import com.lambdaschool.starthere.models.ErrorDetail;
import com.lambdaschool.starthere.models.Tool;
import com.lambdaschool.starthere.services.ToolService;
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
@RequestMapping(value = "/tools")
public class ToolController
{
    @Autowired
    private ToolService toolService;

    @ApiOperation(value = "Return all Tools using Paging and Sorting",
            notes = "Exposes All User Information Associated With a Tool and Tool Rentals. Requires Admin Role to " +
                    "Access",
            response = Tool.class,
            responseContainer = "ArrayList")
    @ApiImplicitParams({@ApiImplicitParam(name = "page",
            dataType = "integer",
            paramType = "query",
            value = "Results page you " + "want to retrieve (0..N)"), @ApiImplicitParam(name = "size",
            dataType = "integer",
            paramType = "query",
            value = "Number of records " + "per page."), @ApiImplicitParam(name = "sort",
            allowMultiple = true,
            dataType = "string",
            paramType = "query",
            value = "Sorting criteria in the format: property(,asc|desc). " + "Default sort order is ascending. " + "Multiple sort criteria are supported.")})
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @GetMapping(value = "/tools",
            produces = {"application/json"})
    public ResponseEntity<?> listAllTools(
            @PageableDefault(page = 0,
                    size = 5)
                    Pageable pageable)
    {
        ArrayList<Tool> myTools = toolService.listAllTools(pageable);
        return new ResponseEntity<>(myTools, HttpStatus.OK);
    }

    @ApiOperation(value = "Retrieve Tool Associated with the Provided Tool Id",
            response = Tool.class)
    @ApiResponses(value = {@ApiResponse(code = 200,
            message = "Tool Found",
            response = Tool.class), @ApiResponse(code = 404,
            message = "Tool Not Found",
            response = ErrorDetail.class)})
    @GetMapping(value = "/tool/{toolId}",
            produces = {"application/json"})
    public ResponseEntity<?> getToolById(
            @ApiParam(value = "Tool Id",
                    required = true,
                    example = "1")
            @PathVariable
                    Long toolId)
    {
        Tool t = toolService.findToolById(toolId);
        return new ResponseEntity<>(t, HttpStatus.OK);
    }

    @ApiOperation(value = "Return All Tools with a Name Like",
            response = Tool.class,
            responseContainer = "ArrayList")
    @GetMapping(value = "/namelike/{toolName}",
            produces = {"application/json"})
    public ResponseEntity<?> listToolsByNameLike(
            @ApiParam(value = "Tool Name",
                    required = true,
                    example = "Some Tool Name")
            @PathVariable
                    String toolName)
    {
        ArrayList<Tool> myTools = toolService.findToolsByNameLike(toolName);
        return new ResponseEntity<>(myTools, HttpStatus.OK);
    }

    @ApiOperation(value = "Return All Tools with a Type Like",
            response = Tool.class,
            responseContainer = "ArrayList")
    @GetMapping(value = "/typelike/{toolType}",
            produces = {"application/json"})
    public ResponseEntity<?> listToolsByTypeLike(
            @ApiParam(value = "Tool Type",
                    required = true,
                    example = "Some Tool Type")
            @PathVariable
                    String toolType)
    {
        ArrayList<Tool> myTools = toolService.findToolsByTypeLike(toolType);
        return new ResponseEntity<>(myTools, HttpStatus.OK);
    }

    @ApiOperation(value = "Return All Tools Where Rental is True",
            response = Tool.class,
            responseContainer = "ArrayList")
    @GetMapping(value = "/rentals",
            produces = {"application/json"})
    public ResponseEntity<?> listToolsThatAreRentals()
    {
        ArrayList<Tool> myTools = toolService.findToolsThatAreRentals();
        return new ResponseEntity<>(myTools, HttpStatus.OK);
    }

    @ApiOperation(value = "Return All Tools Where Available is True",
            response = Tool.class,
            responseContainer = "ArrayList")
    @GetMapping(value = "/available",
            produces = {"application/json"})
    public ResponseEntity<?> listToolsAvailableToRent()
    {
        ArrayList<Tool> myTools = toolService.findToolsAvailableToRent();
        return new ResponseEntity<>(myTools, HttpStatus.OK);
    }

    @ApiOperation(value = "Return All Tools by Variable Cost",
            response = Tool.class,
            responseContainer = "ArrayList")
    @GetMapping(value = "/rentals/{cost}",
            produces = {"application/json"})
    public ResponseEntity<?> listToolsByRentalCost(
            @ApiParam(value = "Rental Cost",
                    required = true,
                    example = "5.00")
            @PathVariable
                    Float cost)
    {
        ArrayList<Tool> myTools = toolService.findToolsByRentalCost(cost);
        return new ResponseEntity<>(myTools, HttpStatus.OK);
    }

    @ApiOperation(value = "Deletes a Tool Based on Id",
            response = void.class)
    @ApiResponses(value = {@ApiResponse(code = 200,
            message = "Tool Successfully Deleted",
            response = void.class)})
    @DeleteMapping(value = "tool/delete/{toolId}")
    public ResponseEntity<?> deleteToolById(
            @ApiParam(value = "Tool Id",
                    required = true,
                    example = "1")
            @PathVariable
                    Long toolId)
    {
        toolService.deleteToolById(toolId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @ApiOperation(value = "Creates a New Tool",
            notes = "Newly Created Tool Id Sent In Response Header",
            response = void.class)
    @ApiResponses(value = {@ApiResponse(code = 200,
            message = "Tool Successfully Created",
            response = void.class), @ApiResponse(code = 500,
            message = "Error Creating Tool",
            response = ErrorDetail.class)})
    @PostMapping(value = "/tool/add",
            consumes = {"application/json"},
            produces = {"application/json"})
    public ResponseEntity<?> addNewTool(@Valid
                                        @RequestBody
                                                Tool newTool) throws URISyntaxException
    {
        newTool = toolService.saveTool(newTool);

        HttpHeaders responseHeaders = new HttpHeaders();

        URI newToolURI = ServletUriComponentsBuilder.fromCurrentRequest().path("/{toolId}").buildAndExpand(newTool.getToolid()).toUri();
        responseHeaders.setLocation(newToolURI);

        return new ResponseEntity<>(null, responseHeaders, HttpStatus.CREATED);
    }

    @ApiOperation(value = "Updates The Information For a Tool Associated with the Provided Tool Id",
            response = void.class)
    @ApiResponses(value = {@ApiResponse(code = 200,
            message = "Tool Updated Successfully",
            response = void.class),})
    @PutMapping(value = "tool/update/{toolId}",
            produces = {"application/json"},
            consumes = {"application/json"})
    public ResponseEntity<?> updateTool(
            @RequestBody
                    Tool updateTool,
            @ApiParam(value = "Tool Id",
                    required = true,
                    example = "1")
            @PathVariable
                    long toolId)
    {
        toolService.updateTool(updateTool, toolId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

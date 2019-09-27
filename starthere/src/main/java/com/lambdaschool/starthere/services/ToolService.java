package com.lambdaschool.starthere.services;

import com.lambdaschool.starthere.models.Tool;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;

public interface ToolService
{
    ArrayList<Tool> listAllTools(Pageable pageable);

    Tool findToolById(long id);

    ArrayList<Tool> findToolsByNameLike(String liketoolname);

    ArrayList<Tool> findToolsByTypeLike(String liketooltype);

    ArrayList<Tool> findToolsThatAreRentals();

    ArrayList<Tool> findToolsAvailableToRent();

    ArrayList<Tool> findToolsByRentalCost(float cost);

    void deleteToolById(long id);

    Tool saveTool(Tool tool);

    Tool updateTool(Tool tool, long id);
}

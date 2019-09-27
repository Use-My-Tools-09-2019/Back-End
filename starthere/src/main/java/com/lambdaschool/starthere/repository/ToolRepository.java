package com.lambdaschool.starthere.repository;

import com.lambdaschool.starthere.models.Tool;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.ArrayList;

public interface ToolRepository extends PagingAndSortingRepository<Tool, Long>
{
    ArrayList<Tool> findToolsByToolnameContainingIgnoreCase(String name);

    ArrayList<Tool> findToolsByTooltypeContainingIgnoreCase(String type);

    ArrayList<Tool> findToolsByAvailableTrue();

    ArrayList<Tool> findToolsByRentalTrue();

    ArrayList<Tool> findToolsByRentalcostEquals(float cost);
}

package com.lambdaschool.starthere.services;

import com.lambdaschool.starthere.models.Tool;
import com.lambdaschool.starthere.repository.ToolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;

@Service(value = "toolService")
public class ToolServiceImpl implements ToolService
{
    @Autowired
    private ToolRepository toolrepos;

    @Override
    public ArrayList<Tool> listAllTools(Pageable pageable)
    {
        ArrayList<Tool> list = new ArrayList<>();
        toolrepos.findAll(pageable).iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public Tool findToolById(long id) throws EntityNotFoundException
    {
        return toolrepos.findById(id).orElseThrow(() -> new EntityNotFoundException(Long.toString(id)));
    }

    @Override
    public  ArrayList<Tool> findToolsByNameLike(String liketoolname) {
        ArrayList<Tool> list = toolrepos.findToolsByToolnameContainingIgnoreCase(liketoolname);
        return list;
    }

    @Override
    public ArrayList<Tool> findToolsByTypeLike(String liketooltype) {
        ArrayList<Tool> list = toolrepos.findToolsByTooltypeContainingIgnoreCase(liketooltype);
        return list;
    }

    @Override
    public ArrayList<Tool> findToolsThatAreRentals() {
        ArrayList<Tool> list = toolrepos.findToolsByRentalTrue();
        return list;
    }

    @Override
    public ArrayList<Tool> findToolsAvailableToRent() {
        ArrayList<Tool> list = toolrepos.findToolsByAvailableTrue();
        return list;
    }

    @Override
    public ArrayList<Tool> findToolsByRentalCost(float cost) {
        ArrayList<Tool> list = toolrepos.findToolsByRentalcostEquals(cost);
        return list;
    }

    @Transactional
    @Override
    public void deleteToolById(long id) throws EntityNotFoundException
    {
        if (toolrepos.findById(id).isPresent()) {
            toolrepos.deleteById(id);
        } else {
            throw new EntityNotFoundException(Long.toString(id));
        }
    }

    @Transactional
    @Override
    public Tool saveTool(Tool tool)
    {
        Tool newTool = new Tool();

        newTool.setToolname(tool.getToolname());
        newTool.setTooldescription(tool.getTooldescription());
        newTool.setTooltype(tool.getTooltype());
        newTool.setToolimageurl(tool.getToolimageurl());
        newTool.setAvailable(tool.isAvailable());
        newTool.setRental(tool.isRental());
        newTool.setRentalcost(tool.getRentalcost());
        newTool.setRentalduration(tool.getRentalduration());

        return toolrepos.save(newTool);
    }

    @Transactional
    @Override
    public Tool updateTool(Tool tool, long id)
    {
        Tool currentTool = toolrepos.findById(id).orElseThrow(() -> new EntityNotFoundException(Long.toString(id)));
        if (tool.getToolname() != null) {
            currentTool.setToolname(tool.getToolname());
        }

        if (tool.getTooldescription() != null) {
            currentTool.setTooldescription(tool.getTooldescription());
        }

        if (tool.getTooltype() != null) {
            currentTool.setTooltype(tool.getTooltype());
        }

        if (tool.getToolimageurl() != null) {
            currentTool.setToolimageurl(tool.getToolimageurl());
        }

        if (tool.getRentalcost() != 0) {
            currentTool.setRentalcost(tool.getRentalcost());
        }

        if (tool.getRentalduration() != null) {
            currentTool.setRentalduration(tool.getRentalduration());
        }

        return toolrepos.save(currentTool);
    }
}

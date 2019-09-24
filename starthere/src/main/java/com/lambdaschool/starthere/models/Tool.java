package com.lambdaschool.starthere.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@ApiModel(value = "Tool", description = "The Tool Entity")
@Entity
@Table(name = "tool")
public class Tool
{
//  Table fields
    @ApiModelProperty(name = "toolid", value = "Primary Key for Tool", required = true, example = "1")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long toolid;

    @ApiModelProperty(name = "toolname", value = "Name of Tool", required = true, example = "Orbital Sander")
    @Column(name = "toolname", nullable = false)
    private String toolname;

    @ApiModelProperty(name = "tooldescription", value = "Description of Tool", required = true, example = "Some " +
            "Description")
    @Column(name = "tooldescription", nullable = false)
    private String tooldescription;

    @ApiModelProperty(name = "tooltype", value = "Type of Tool", required = true, example = "PowerCord, PowerBattery")
    @Column(name = "tooltype", nullable = false)
    private String tooltype;

    @ApiModelProperty(name = "toolimageurl", value = "Image of Tool", required = false, example = "http://www.url" +
            ".com/tool_image.jpg")
    private String toolimageurl;

    @ApiModelProperty(name = "available", value = "Tool Availability", required = true, example = "Not " +
            "Available = False")
    @Column(name = "available", nullable = false)
    private boolean available;

    @ApiModelProperty(name = "rental", value = "True/False", required = true, example = "Not A Rental = False")
    @Column(name = "rental", nullable = false)
    private boolean rental;

    @ApiModelProperty(name = "rentalcost", value = "Cost To Rent Tool For Rental Duration", required = false, example =
            "25.00")
    private float rentalcost;

    @ApiModelProperty(name = "rentalduration", value = "Duration Of Rental", required = false, example = "48 Hours")
    private String rentalduration;

    @OneToMany(mappedBy = "tool", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties("tool")
    private List<Rental> rentals = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "ownerid")
    @JsonIgnoreProperties("tools")
    private User user;

//  Constructors
    public Tool()
    {
    }

    public Tool(String toolname, String tooldescription, String tooltype, String toolimageurl, boolean available, boolean rental, float rentalcost, String rentalduration, List<Rental> rentals)
    {
        this.toolname = toolname;
        this.tooldescription = tooldescription;
        this.tooltype = tooltype;
        this.toolimageurl = toolimageurl;
        this.available = available;
        this.rental = rental;
        this.rentalcost = rentalcost;
        this.rentalduration = rentalduration;
        this.rentals = rentals;
    }

    //  Getters / Setters

    public long getToolid()
    {
        return toolid;
    }

    public void setToolid(long toolid)
    {
        this.toolid = toolid;
    }

    public String getToolname()
    {
        return toolname;
    }

    public void setToolname(String toolname)
    {
        this.toolname = toolname;
    }

    public String getTooldescription()
    {
        return tooldescription;
    }

    public void setTooldescription(String tooldescription)
    {
        this.tooldescription = tooldescription;
    }

    public String getTooltype()
    {
        return tooltype;
    }

    public void setTooltype(String tooltype)
    {
        this.tooltype = tooltype;
    }

    public String getToolimageurl()
    {
        return toolimageurl;
    }

    public void setToolimageurl(String toolimageurl)
    {
        this.toolimageurl = toolimageurl;
    }

    public boolean isAvailable()
    {
        return available;
    }

    public void setAvailable(boolean available)
    {
        this.available = available;
    }

    public boolean isRental()
    {
        return rental;
    }

    public void setRental(boolean rental)
    {
        this.rental = rental;
    }

    public float getRentalcost()
    {
        return rentalcost;
    }

    public void setRentalcost(float rentalcost)
    {
        this.rentalcost = rentalcost;
    }

    public String getRentalduration()
    {
        return rentalduration;
    }

    public void setRentalduration(String rentalduration)
    {
        this.rentalduration = rentalduration;
    }

    public List<Rental> getRentals()
    {
        return rentals;
    }

    public void setRentals(List<Rental> rentals)
    {
        this.rentals = rentals;
    }
}

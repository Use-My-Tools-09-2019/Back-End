package com.lambdaschool.starthere.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.Date;

@ApiModel(value = "Rental", description = "The Rental Entity")
@Entity
@Table(name = "rental")
public class Rental
{
    @ApiModelProperty(name = "rentalid", value = "Primary Key for Rental", required = true, example = "1")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long rentalid;

    @ApiModelProperty(name = "rentaldate", value = "Date Of Rental", required = true)
    @Column(name = "rentaldate", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date rentaldate;

    @ManyToOne
    @JoinColumn(name = "userid")
    @JsonIgnoreProperties("rentals")
    private User user;

    @ManyToOne
    @JoinColumn(name = "toolid")
    @JsonIgnoreProperties("rentals")
    private Tool tool;

//  Constructors
    public Rental()
    {
    }

    public Rental(Date rentaldate, User user, Tool tool)
    {
        this.rentaldate = rentaldate;
        this.user = user;
        this.tool = tool;
    }

    //  Getters / Setters
    public long getrentalid()
    {
        return rentalid;
    }

    public void setrentalid(long rentalid)
    {
        this.rentalid = rentalid;
    }

    public Date getrentaldate()
    {
        return rentaldate;
    }

    public void setrentaldate(Date rentaldate)
    {
        this.rentaldate = rentaldate;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public Tool getTool()
    {
        return tool;
    }

    public void setTool(Tool tool)
    {
        this.tool = tool;
    }
}

package com.lambdaschool.starthere.models;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

@ApiModel(value = "UserAddress", description = "The UserAddress Entity")
@Entity
@Table(name ="useraddress")
public class UserAddress
{
//  Create table fields
    @ApiModelProperty(name = "addressid", value = "Primary Key for UserAddress", required = true, example = "1")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long addressid;

    @ApiModelProperty(name = "street", value = "Name of Street", required = true, example = "Some Street Name")
    @Column(name = "street", nullable = false)
    private String street;

    @ApiModelProperty(name = "apartment", value = "Apartment Number", required = false, example = "301")
    private String apartment;

    @ApiModelProperty(name = "city", value = "Name of City", required = true, example = "Seattle")
    @Column(name = "city", nullable = false)
    private String city;

    @ApiModelProperty(name = "state", value = "Name of State", required = true, example = "Washington")
    @Column(name = "state", nullable = false)
    private String state;

    @Column(name = "zip", nullable = false)
    private String zip;

//  Shared primary key
    @OneToOne
    @MapsId
    private User user;

//  Constructors
    public UserAddress()
    {
    }

    public UserAddress(String street, String apartment, String city, String state, String zip, User user)
    {
        this.street = street;
        this.apartment = apartment;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.user = user;
    }

    //  Getters / Setters
    public long getaddressid()
    {
        return addressid;
    }

    public void setaddressid(long addressid)
    {
        this.addressid = addressid;
    }

    public String getStreet()
    {
        return street;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    public String getApartment()
    {
        return apartment;
    }

    public void setApartment(String apartment)
    {
        this.apartment = apartment;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public String getZip()
    {
        return zip;
    }

    public void setZip(String zip)
    {
        this.zip = zip;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }
}

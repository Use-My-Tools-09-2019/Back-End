package com.lambdaschool.starthere.services;

import com.lambdaschool.starthere.models.User;
import com.lambdaschool.starthere.models.UserAddress;
import com.lambdaschool.starthere.repository.UserAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;
import javax.persistence.EntityNotFoundException;

import java.util.ArrayList;

@Service(value = "userAddressService")
public class UserAddressServiceImpl implements UserAddressService
{
    @Autowired
    private UserAddressRepository useraddressrepos;

    @Override
    public UserAddress getAddressByUser(User user)
    {
        return useraddressrepos.findByUser(user);
    }

    @Override
    public UserAddress saveAddress(UserAddress useraddress)
    {
        UserAddress newUserAddress = new UserAddress();

        newUserAddress.setStreet(useraddress.getStreet());
        if (newUserAddress.getApartment() != null)
        {
            newUserAddress.setApartment(useraddress.getApartment());
        }
        newUserAddress.setCity(useraddress.getCity());
        newUserAddress.setState(useraddress.getState());
        newUserAddress.setZip(useraddress.getZip());

        return useraddressrepos.save(newUserAddress);
    }

    @Override
    public UserAddress updateAddress(UserAddress useraddress, Long id)
    {
        UserAddress currentUserAddress =
                useraddressrepos.findById(id).orElseThrow(() -> new EntityNotFoundException(Long.toString(id)));
        if (useraddress.getStreet() != null) {
            currentUserAddress.setStreet(useraddress.getStreet());
        }

        if (useraddress.getApartment() != null) {
            currentUserAddress.setApartment(useraddress.getApartment());
        }

        if (useraddress.getCity() != null) {
            currentUserAddress.setCity(useraddress.getCity());
        }

        if (useraddress.getState() != null) {
            currentUserAddress.setState(useraddress.getState());
        }

        if (useraddress.getZip() != null) {
            currentUserAddress.setZip(useraddress.getZip());
        }

        return useraddressrepos.save(currentUserAddress);
    }
}

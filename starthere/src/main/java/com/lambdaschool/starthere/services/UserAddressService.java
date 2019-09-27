package com.lambdaschool.starthere.services;

import com.lambdaschool.starthere.models.User;
import com.lambdaschool.starthere.models.UserAddress;
import org.springframework.data.domain.Pageable;
import java.util.ArrayList;

public interface UserAddressService
{
    UserAddress getAddressByUser(User user);

    UserAddress saveAddress(UserAddress useraddress);

    UserAddress updateAddress(UserAddress useraddress, Long id);
}

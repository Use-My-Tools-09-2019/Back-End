package com.lambdaschool.starthere.repository;

import com.lambdaschool.starthere.models.User;
import com.lambdaschool.starthere.models.UserAddress;
import org.springframework.data.repository.CrudRepository;

public interface UserAddressRepository extends CrudRepository<UserAddress, Long>
{
    UserAddress findByUser(User user);
}

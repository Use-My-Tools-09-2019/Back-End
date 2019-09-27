package com.lambdaschool.starthere.repository;

import com.lambdaschool.starthere.models.Rental;
import com.lambdaschool.starthere.models.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;

public interface RentalRepository extends CrudRepository <Rental, Long>
{
    ArrayList<Rental> findRentalsByUser(User user);
}

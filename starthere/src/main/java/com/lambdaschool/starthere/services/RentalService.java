package com.lambdaschool.starthere.services;

import com.lambdaschool.starthere.models.Rental;
import com.lambdaschool.starthere.models.User;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;

public interface RentalService
{
    ArrayList<Rental> listAllRentals(Pageable pageable);

    Rental findRentalById(long id);

    ArrayList<Rental> findRentalsByUser(User user);

    Rental saveRental(Rental rental);

}

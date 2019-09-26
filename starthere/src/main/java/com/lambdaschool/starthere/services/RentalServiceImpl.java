package com.lambdaschool.starthere.services;

import com.lambdaschool.starthere.exceptions.ResourceNotFoundException;
import com.lambdaschool.starthere.models.Rental;
import com.lambdaschool.starthere.models.User;
import com.lambdaschool.starthere.models.UserRoles;
import com.lambdaschool.starthere.repository.RentalRepository;
import com.lambdaschool.starthere.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;

@Service(value = "rentalService")
public class RentalServiceImpl implements RentalService
{
    @Autowired
    private RentalRepository rentalrepos;

    @Autowired
    private UserRepository userrepos;

    @Override
    public ArrayList<Rental> listAllRentals(Pageable pageable)
    {
        ArrayList<Rental> list = new ArrayList<>();
        rentalrepos.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public Rental findRentalById(long id)
    {
        return rentalrepos.findById(id).orElseThrow(() -> new EntityNotFoundException(Long.toString(id)));
    }

    @Override
    public ArrayList<Rental> findRentalsByUser(User user)
    {
        ArrayList<Rental> list = new ArrayList<>();
        rentalrepos.findRentalsByUser(user).iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public Rental saveRental(Rental rental)
    {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User currentUser = userrepos.findByUsername(authentication.getName());

        Rental newRental = new Rental();
        newRental.setUser(currentUser);
        newRental.setTool(rental.getTool());

        return rentalrepos.save(newRental);
    }

    //    @Transactional
//    @Override
//    public Rental save(Rental rental)
//    {
//        Rental newRental = new Rental();
//        newRental.setTool(.getName());
//
//        ArrayList<UserRoles> newUsers = new ArrayList<>();
//        for (UserRoles ur : role.getUserroles())
//        {
//            long id = ur.getUser()
//                    .getUserid();
//            User user = userrepos.findById(id)
//                    .orElseThrow(() -> new ResourceNotFoundException("User id " + id + " not found!"));
//            newUsers.add(new UserRoles(ur.getUser(), newRole));
//        }
//        newRole.setUserroles(newUsers);
//
//        return rolerepos.save(role);
//    }
}

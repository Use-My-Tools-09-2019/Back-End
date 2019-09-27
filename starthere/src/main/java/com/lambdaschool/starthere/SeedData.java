package com.lambdaschool.starthere;

import com.lambdaschool.starthere.models.*;
import com.lambdaschool.starthere.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Transactional
@Component
public class SeedData implements CommandLineRunner
{
    @Autowired
    RoleService roleService;

    @Autowired
    UserService userService;

    @Autowired
    RentalService rentalService;

    @Autowired
    ToolService toolService;

    @Autowired
    UserAddressService userAddressService;

    @Override
    public void run(String[] args) throws Exception
    {
        Role r1 = new Role("admin");
        Role r2 = new Role("user");
        Role r3 = new Role("data");

        roleService.save(r1);
        roleService.save(r2);
        roleService.save(r3);

        // admin, data, user
        ArrayList<UserRoles> admins = new ArrayList<>();
        admins.add(new UserRoles(new User(), r1));
        admins.add(new UserRoles(new User(), r2));
        admins.add(new UserRoles(new User(), r3));
        User u1 = new User("admin", "password", admins);
        u1.getUseremails().add(new Useremail(u1, "admin@lambda.com"));
        u1.getUseremails().add(new Useremail(u1, "admin@lambda.com"));

        userService.save(u1);

        // data, user
        ArrayList<UserRoles> datas = new ArrayList<>();
        datas.add(new UserRoles(new User(), r3));
        datas.add(new UserRoles(new User(), r2));
        User u2 = new User("kona", "1234567", datas);
        u2.getUseremails().add(new Useremail(u2, "kona@lambda.com"));
        u2.getUseremails().add(new Useremail(u2, "hops@lambda.com"));
        u2.getUseremails().add(new Useremail(u2, "bunny@lambda.com"));
        userService.save(u2);

        // user
        ArrayList<UserRoles> users = new ArrayList<>();
        users.add(new UserRoles(new User(), r2));
        User u3 = new User("jcrn", "password123", users);
        u3.getUseremails().add(new Useremail(u3, "jcrn@lambda.com"));
        userService.save(u3);

        users = new ArrayList<>();
        users.add(new UserRoles(new User(), r2));
        User u4 = new User("msquared88", "password456", users);
        u4.getUseremails().add(new Useremail(u4, "msquared88@lambda.com"));
        userService.save(u4);

        users = new ArrayList<>();
        users.add(new UserRoles(new User(), r2));
        User u5 = new User("alecblkly", "password789", users);
        u5.getUseremails().add(new Useremail(u5, "alecblkly@lambda.com"));
        userService.save(u5);

   }
}
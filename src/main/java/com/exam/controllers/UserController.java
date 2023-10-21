package com.exam.controllers;

import com.exam.models.Role;
import com.exam.models.User;
import com.exam.models.UserRole;
import  com.exam.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/user")
public class UserController {
     @Autowired
     private UserService userService;

//     @GetMapping("/hello")
//      public String hellloMsf()
//     {
//         return "hello exam portal developer";
//     }

    @PostMapping("/")
    public User createUser(@RequestBody User user) throws Exception {
        // we are giving manually role or giving only one or two roles
        Role role=new Role();
        role.setRoleName("NORMAL USER");
        role.setRoleId(45L);

        Set<UserRole> roles=new HashSet<>();

        UserRole userRoles=new UserRole();
        userRoles.setUser(user);
        userRoles.setRole(role);
        roles.add(userRoles);
       return userService.createUser(user,roles);


    }
}

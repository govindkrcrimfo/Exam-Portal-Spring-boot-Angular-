package com.exam.services.impl;

import com.exam.Repo.RoleRepo;
import com.exam.Repo.UserRepo;
import com.exam.models.User;
import com.exam.models.UserRole;
import com.exam.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private RoleRepo roleRepo;



    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {
        System.out.println("inside crate user method");
        System.out.println(user.getUsername());

        User localUser=userRepo.findByUsername(user.getUsername());
        if(localUser !=null)
        {
            System.out.println("User  is already present !!");
            throw new Exception("User already present");
        }
        else
        {
             for(UserRole ur:userRoles)
            {
                roleRepo.save(ur.getRole());
//                System.out.println(ur.getRole());
            }
             user.getUserRoles().addAll(userRoles);
             localUser=this.userRepo.save(user);
        }
        return localUser;
    }
}

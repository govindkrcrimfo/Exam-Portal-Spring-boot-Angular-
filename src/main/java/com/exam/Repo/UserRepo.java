package com.exam.Repo;

import com.exam.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository <User,Long> {
    User findByUsername(String userName);

}

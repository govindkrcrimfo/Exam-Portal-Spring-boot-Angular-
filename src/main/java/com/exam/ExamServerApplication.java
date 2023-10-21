package com.exam;

import com.exam.models.Role;
import com.exam.models.User;
import com.exam.models.UserRole;
import com.exam.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamServerApplication  implements CommandLineRunner {

	@Autowired
	private UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(ExamServerApplication.class, args);
		System.out.println("hello exam portal");
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println("Starting code !!");
//
//
//
//
//		User user=new User();
//		user.setFirstName("Govind");
//		user.setLastName("kumar");
//		user.setUsername("govindkrcrimfo");
//		user.setPassword("root@123");
//		user.setEmail("Govind@gmail.com");
//		user.setProfile("default.png");
//		user.setPhone("9330928806");
//
//		Role role1=new Role();
//		role1.setRoleId(44L);
//		role1.setRoleName("ADMIN");
//
//		Set<UserRole> userRoleSet=new HashSet<>();
//		UserRole userRole=new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//		userRoleSet.add(userRole);
//
//		User user1=userService.createUser(user,userRoleSet);
//
//		System.out.println(user1.getUsername());



	}
}

package com.hcl.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.springdemo.domain.User;
import com.hcl.springdemo.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
/*	@RequestMapping(value="/getCustomerDetails/{id}",produces= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public User getUserDetails(@PathVariable long id) {
		return null;
	}
	
	@PostMapping("/updateUserDetails")
	public User updateUserDetails(@RequestBody User user) {
		return user;
	}*/
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userService.getUsers();
	}
}

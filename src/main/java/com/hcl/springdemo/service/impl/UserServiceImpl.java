package com.hcl.springdemo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.springdemo.domain.User;
import com.hcl.springdemo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;
	
	public List<User> getUsers() {
		return null;
	}

}

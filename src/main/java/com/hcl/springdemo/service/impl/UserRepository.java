package com.hcl.springdemo.service.impl;

import java.util.List;

import com.hcl.springdemo.domain.User;

public interface UserRepository {
	
	public List<User> findAll();
}

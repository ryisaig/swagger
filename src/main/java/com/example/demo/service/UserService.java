package com.example.demo.service;

import com.example.demo.domain.User;

public interface UserService {
	
	public String createUser(User user) throws Exception;
	
	public User getUserById(String id);
}

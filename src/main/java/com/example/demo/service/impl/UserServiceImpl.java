package com.example.demo.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	public static Map<String, User> USERS_MAP = null;
	
	public String createUser(User user) throws Exception {
		System.out.println("[START] UserService.createUser for username: " + user.getUsername());

		try {
			if(USERS_MAP == null) {
				USERS_MAP = new HashMap<>();
			}
			
			//generate userId
			String id = System.currentTimeMillis() + String.valueOf((int) Math.random());
			
			USERS_MAP.put(id, user);
			System.out.println("[END] UserService.createUser. Succesfully created userId: " + id);
			
			return id;
			
		} catch(Exception e) {
			System.out.println("[END] UserService.createUser Error creating user with cause: " + e.getMessage());
			throw e;
		}
		
	}
	
	public User getUserById(String id) {
		return USERS_MAP.get(id);
	}
}

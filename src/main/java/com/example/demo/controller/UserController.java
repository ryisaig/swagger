package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.User;
import com.example.demo.request.CreateUserRequest;
import com.example.demo.response.CreateUserResponse;
import com.example.demo.response.GetUserResponse;
import com.example.demo.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/")
	public CreateUserResponse createUser(@RequestBody CreateUserRequest createUserRequest) {
		CreateUserResponse response = new CreateUserResponse();
		try {
			
			User user  = new User(createUserRequest);
			String userId = userService.createUser(user);
			
			response.setCode("1");
			response.setMessage("Success");
			response.setUserId(userId);
			
		} catch(Exception e) {
			response.setCode("0");
			response.setMessage("Error");
			response.setUserId("");
		}
		
		return response;
	}
	
	@GetMapping("/{userId}")
	public GetUserResponse getUser(@PathVariable String userId) {
		GetUserResponse response = new GetUserResponse();
		User user = null;
		try {
			
			user = userService.getUserById(userId);
			
			response.setCode("1");
			response.setMessage("Success");
			response.setUser(user);
			
		} catch(Exception e) {
			response.setCode("0");
			response.setMessage("Error");
			response.setUser(user);
		}
		return response;
		
	}
}

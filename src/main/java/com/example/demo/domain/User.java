package com.example.demo.domain;

import java.util.Date;

import com.example.demo.request.CreateUserRequest;

public class User {
	
	private String username;
	private String password;
	private String verifyPassword;
	private Date dateCreated;
	
	public User(CreateUserRequest createUserRequest) {
		super();
		this.username = createUserRequest.getUsername();
		this.password = createUserRequest.getPassword();
		this.verifyPassword = createUserRequest.getVerifyPassword();
		this.dateCreated = createUserRequest.getDateCreated();
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	protected String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	protected String getVerifyPassword() {
		return verifyPassword;
	}
	public void setVerifyPassword(String verifyPassword) {
		this.verifyPassword = verifyPassword;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
}

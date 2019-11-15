package com.example.demo.request;

import java.util.Date;

import javax.validation.constraints.NotEmpty;

public class CreateUserRequest {
	
	@NotEmpty()
	private String username;
	
	@NotEmpty()
	private String password;
	
	@NotEmpty()
	private String verifyPassword;
	
	private Date dateCreated;
	
	public CreateUserRequest(String username, String password, String verifyPassword) {
		super();
		this.username = username;
		this.password = password;
		this.verifyPassword = verifyPassword;
		this.dateCreated = new Date();
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getVerifyPassword() {
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

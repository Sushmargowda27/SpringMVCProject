package com.jspiders.controller;

public class Customer 
{
	String userid;
	String name;
	String password;
	String email;
	public Customer(String userid, String name, String password, String email) 
	{
		super();
		this.userid = userid;
		this.password = password;
		this.email = email;
		this.name= name;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}

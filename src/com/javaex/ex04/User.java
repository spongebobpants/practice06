package com.javaex.ex04;

public class User {
	//field
	public String id;
	public String password;
	public String name;
	
	//constructor
	public User() {}
	
	public User(String id, String password, String name) {
		this.id=id;
		this.password=password;
		this.name=name;
	}
	//method-g/s

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	//method-general
	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", name=" + name + "]";
	}
	
	public void showInfo() {
		
	}
	
	
	
}

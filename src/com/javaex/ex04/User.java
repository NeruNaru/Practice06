package com.javaex.ex04;

public class User {
	//field
	private String id;
	private String password;
	private String name;
	
	//editor
	public User() {
	}
	
	public User(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}
	
	//method g/s
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
	
	//method normal
	public void showInfo() {
		System.out.println("#아이디:" + id + ", #패스워드:" + password);
	}
	
}

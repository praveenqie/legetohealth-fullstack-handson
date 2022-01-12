package com.stringexample;

public class User {
	
	private String name;
	private String age;
	private String gender;
	
	public User(String name, String age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public User() {
		super();
	}
	public String getName() {
		return name;
	}
	public String getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	

}

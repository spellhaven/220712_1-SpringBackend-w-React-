package com.spellhaven.userlist.dto;

public class UserDto {

	private int id; // PK (Primary Key인데 인싸들은 다 줄여 부른다.)
	private String username;
	private String phone;
	private String nickname;
	private int age;
	private int membership;
	
	public UserDto() {
		super();
	}
	
	public UserDto(int id, String username, String phone, String nickname, int age, int membership) {
		super();
		this.id = id;
		this.username = username;
		this.phone = phone;
		this.nickname = nickname;
		this.age = age;
		this.membership = membership;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMembership() {
		return membership;
	}
	public void setMembership(int membership) {
		this.membership = membership;
	}
	
	
	
}

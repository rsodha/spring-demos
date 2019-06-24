package com.rsodha;

public class User {
	private int id;
	private String email;
	private String name;

	public User() {
	}

	public User(int id, String email, String name) {
		this.id = id;
		this.email = email;
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", name=" + name + "]";
	}
}
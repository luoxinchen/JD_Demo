package com.demo.pojo;
/**
 *此类为用户个人信息类 
 */
public class Users {
	private int id;
	private String name;
	private String password;
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
}

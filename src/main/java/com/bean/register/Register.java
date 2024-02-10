package com.bean.register;

public class Register {
	private String userName;
	private String userMob;
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Register(String userName, String userMob) {
		super();
		this.userName = userName;
		this.userMob = userMob;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserMob() {
		return userMob;
	}
	public void setUserMob(String userMob) {
		this.userMob = userMob;
	}
	@Override
	public String toString() {
		return "Register [userName=" + userName + ", userMob=" + userMob + "]";
	}
	
	
}

package com.stud.register;

public class StudentRegister {
	private Integer stud_id;		//This is identical with the .jsp file input tag path "stud_id"
	private String stud_name;		//This is identical with the .jsp file input tag path "stud_name"
	public StudentRegister() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentRegister(Integer stud_id, String stud_name) {
		super();
		this.stud_id = stud_id;
		this.stud_name = stud_name;
	}
	public Integer getStud_id() {
		return stud_id;
	}
	public void setStud_id(Integer stud_id) {
		this.stud_id = stud_id;
	}
	public String getStud_name() {
		return stud_name;
	}
	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}
	@Override
	public String toString() {
		return "Student_Register [stud_id=" + stud_id + ", stud_name=" + stud_name + "]";
	}
	
	
}

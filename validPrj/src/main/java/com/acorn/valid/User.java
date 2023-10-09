package com.acorn.valid;

import java.util.Arrays;
import java.util.Date;


public class User {
	
	
	String id;
	String pw;
	Date birth ;
	String[] hobby;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	public User(String id, String pw, Date birth, String[] hobby) {
		super();
		this.id = id;
		this.pw = pw;
		this.birth = birth;
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + ", birth=" + birth + ", hobby=" + Arrays.toString(hobby) + "]";
	}
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	 

}

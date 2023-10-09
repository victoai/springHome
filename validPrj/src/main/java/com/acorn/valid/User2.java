package com.acorn.valid;

public class User2 {

	String id;
	String pw;
	
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
	public User2(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "User2 [id=" + id + ", pw=" + pw + "]";
	}
	
	
	public User2() {
		// TODO Auto-generated constructor stub
	}
	
}

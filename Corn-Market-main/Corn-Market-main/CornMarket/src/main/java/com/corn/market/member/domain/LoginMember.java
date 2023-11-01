package com.corn.market.member.domain;

public class LoginMember {

	private String user_id;
	private String user_pw;
	
	public LoginMember() {}

	public LoginMember(String user_id, String user_pw) {
		super();
		this.user_id = user_id;
		this.user_pw = user_pw;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_pw() {
		return user_pw;
	}

	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}

	@Override
	public String toString() {
		return "LoginMember [user_id=" + user_id + ", user_pw=" + user_pw + "]";
	}
	
}

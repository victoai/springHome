package com.acorn.cook;

public class SunCook extends Cook implements 한식가능한{

	public SunCook(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String 된장찌게만들기() {
		// TODO Auto-generated method stub
		썰기();
		return "된찌완성";
	}

	@Override
	public String 불고기만들기() {
		// TODO Auto-generated method stub
		return "불고기완성";
	}

	@Override
	public String 김밥만들기() {
		// TODO Auto-generated method stub
		return "김밥완성";
	}
	
}

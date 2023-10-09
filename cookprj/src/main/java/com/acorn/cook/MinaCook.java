package com.acorn.cook;

public class MinaCook extends Cook implements 한식가능한{

	public MinaCook(String name){
		super(name);
	}

	@Override
	public String 된장찌게만들기() {
		return "된장찌개 완성";
	}

	@Override
	public String 불고기만들기() {
		// TODO Auto-generated method stub
		return "불고기 완성";
	}

	@Override
	public String 김밥만들기() {
		// TODO Auto-generated method stub
		return "김밥 완성";
	}
}

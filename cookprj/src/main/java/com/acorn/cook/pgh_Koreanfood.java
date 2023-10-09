package com.acorn.cook;

public class pgh_Koreanfood extends Cook implements 한식가능한 {
	
	public pgh_Koreanfood(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String 된장찌게만들기() {
		
		return "된장찌개 완성";
	}

	@Override
	public String 불고기만들기() {
		
		return "불고기 완성";
	}

	@Override
	public String 김밥만들기() {
		
		return "김밥 완성";
	}

}

package com.acorn.cook;

public class minjoo extends Cook implements 한식가능한{

	
	
	public minjoo(String name) {
		super(name);
		System.out.println("한식명인 " + name + "의 요리 레시피");
	}

	@Override
	public String 된장찌게만들기() {
		System.out.println("고기용 된장찌개 만들기");
		return "고깃집 된장찌개";
	}

	@Override
	public String 불고기만들기() {
		System.out.println("궁중 불고기 만들기");
		return "궁중불고기";
	}

	@Override
	public String 김밥만들기() {
		System.out.println("섞어 김밥만들기");
		return "김밥";
	}

	
}

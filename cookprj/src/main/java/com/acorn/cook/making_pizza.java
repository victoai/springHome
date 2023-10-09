package com.acorn.cook;

 

public class making_pizza extends Cook implements 양식가능한 {

	public making_pizza(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String 피자만들기() {
		Cook cook = new Cook(name);
		cook.썰기();
		cook.굽기();
		return "피자를 만듭니다.";
	}

	@Override
	public String 스파게티만들기() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String 돈까스만들기() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		making_pizza pizza = new making_pizza("피자만들기");
		
		System.out.println(pizza.피자만들기());

	}

}

package com.acorn.cook;


public class Cookus extends Cook implements 한식가능한 {

	public Cookus(String name) {
		super(name);
	}

	public void what(String name) {
		System.out.println(name+"을(를)");
	}
	
	@Override
	public String 된장찌게만들기() {

		return null;
	}

	@Override
	public String 불고기만들기() {
		
		what("상추");
		썰기();
		what("불고기");
		굽기();
		what("고기");
		튀기기();
		what("야채");
		볶기();
		
		return "불고기";
	}

	@Override
	public String 김밥만들기() {
		// TODO Auto-generated method stub
		return null;
	}
	
	 
}

//--------------------------------------------------------


 

 

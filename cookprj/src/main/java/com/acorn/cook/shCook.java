package com.acorn.cook;

public class shCook extends Cook implements 양식가능한{

	public shCook(String name) {
		super(name);
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public String 돈까스만들기() {
		return "돈까스 완성";
	}
	
	@Override
	public String 스파게티만들기() {
		return "스파게티 완성";
	}
	@Override
	public String 피자만들기() {
		return "피자 완성";
	}
	
	public static void main(String[] args) {
		shCook s = new shCook("윤성혁");
		
		System.out.println("요리사: "+ s.toString());
		System.out.println();
		
		s.썰기();
		s.굽기();
		String pizza = s.피자만들기();
		System.out.println(pizza);
		
		System.out.println();
		
		s.썰기();
		s.튀기기();
		String cutlet = s.돈까스만들기();
		System.out.println(cutlet);
		
		System.out.println();
		
		s.썰기();
		s.볶기();
		String pasta = s.스파게티만들기();
		System.out.println(pasta);
		
	}
}

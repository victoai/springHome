package com.acorn.cook;

public class LswCook   extends Cook  implements 양식가능한{

	
	
	@Override
	public String 스파게티만들기() {
		// TODO Auto-generated method stub
		return 스파게티만들기();
	}

	@Override
	public String 피자만들기() {
		// TODO Auto-generated method stub
		return 피자만들기();
	}

	@Override
	public String 돈까스만들기() {
		// TODO Auto-generated method stub
		return 돈까스만들기();
	}

	
	public LswCook( String name) {
		super( name);
		
	}
	 
	public LswCook() {
		// TODO Auto-generated constructor stub
	}
	
	
	
  

	public static void main(String[] args) {
    	Cook ck = new Cook(null);
    	ck.굽기();
    	
    	LswCook ls = new LswCook("이승원");    	
    	System.out.println(ls);
	}
	
}
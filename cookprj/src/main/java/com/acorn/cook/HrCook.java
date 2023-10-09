package com.acorn.cook;

public class HrCook extends Cook implements 양식가능한{

	public HrCook(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String 스파게티만들기() {
		// TODO Auto-generated method stub
		return "스파게티임";
	}

	@Override
	public String 피자만들기() {
		// TODO Auto-generated method stub
		return "피자임";
	}

	@Override
	public String 돈까스만들기() {
		// TODO Auto-generated method stub
		return "돈까스임";
	}
 
	
}

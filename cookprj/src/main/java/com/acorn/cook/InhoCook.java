package com.acorn.cook;

class InhoCook extends Cook implements 중식가능한 {

	public InhoCook(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String 마라탕만들기() {
		// TODO Auto-generated method stub
		return "마라탕";
	}

	@Override
	public String 탕수육만들기() {
		// TODO Auto-generated method stub
		return "탕수육";
	}

	@Override
	public String 짜장면만들기() {
		// TODO Auto-generated method stub
		return "짜장면";
	}

}

package com.acorn.api.naver;

public class MethodTest0 {	
 	
	public static void main(String[] args) {		
		//1~10까지 합 구하기	
		MethodTest0 obj = new MethodTest0();
		int result  = obj.getTentotal();	  // 매서드 호출	
		//
		
	}
	
	
	//매서드 static  
	//  => 사용방법이 달라짐 
	//매서드가 static이 아닌 경우는 클래스 객체 생성이후에 매서드를 사용가능함 
	public  int getTentotal() {
		int sum=0;
		for( int i=0; i<=10 ;i++) {
			sum+= i;
		}		
		System.out.println( sum);
		return  sum;
	}

}

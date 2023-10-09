package com.acorn.api.naver;

public class MethodTest3 {

	public static void main(String[] args) {
		

		int[] numbers = {18,8,9,27};		
		int max  = findMAX(numbers);
		System.out.println(  max);
		 
	}

	public static int  findMAX(int[] numbers) {
		int max =numbers[0];
		
		for( int i=1;i< numbers.length ; i++) {			
			if( numbers[i] > max) {
				max = numbers[i];
			}			
		}	
		
		System.out.println( max);
		return max;
	}

}

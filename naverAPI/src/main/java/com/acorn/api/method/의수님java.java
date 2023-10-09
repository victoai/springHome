package com.acorn.api.method;

public class 의수님java {

	
	public static void main(String[] args) {
		
		
		int[] numbers = {10,9,27,8,9};
		printMax(numbers);
		
	}

	private static void printMax(int[] numbers) {
		int max=numbers[0];
		
		for(int num:numbers) {
			if(max<num) {
				max=num	;
			}
		}
		System.out.println("최대값: "+max);
	}

	

}

package com.acorn.api.method;

public class 정현님 {

	public static void main(String[] args) { 		
		MAX();		
		int[] number = {10, 9, 27, 8, 9,18,8};
		int result  = MAX2(number); 
	}

	private static int MAX2(int[] arr) {
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;		
	}
	
	public static void MAX() {
		int[] number = {10, 9, 27, 8, 9};
		int max = number[0];
		for(int i=0; i<number.length; i++) {
			if(number[i]>max) {
				max = number[i];
			}
		}
		System.out.println(max);
	}
}
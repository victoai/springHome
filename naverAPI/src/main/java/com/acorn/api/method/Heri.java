package com.acorn.api.method;

public class Heri {
	public static void main(String[] args) {
		int[] number = {10,9,27,8,9};
		
		int max =0;
		for(int a:number) {
			if(a>max) {
				max=a;
			}
		}
		System.out.println(max);
		
		Heri t=new Heri();
		int result = t.getMax(number);
		System.out.println(result);
	}
	
	public int getMax(int[] number) {
		int max =0;
		for(int a:number) {
			if(a>max) {
				max=a;
			}
		}
		return max;
	}
}

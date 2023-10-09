package com.acorn.api.method;

public class MethodPrac01_민주 {

	public static void main(String[] args) {
		int[] numbers = {1010,9,27,8,9,100,1};
		MethodPrac01_민주 mtd = new MethodPrac01_민주();
		System.out.println(mtd.max(numbers));

	}
	
	public int max(int[] numbers) {
		int tmp = 0;
		int max = 0;
		for(int i=0; i<numbers.length-1; i++) {
			for(int j=i+1; j<numbers.length;j++) {
				if(numbers[i]> numbers[j]) {
					tmp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = tmp;
				}
			}
		}
		max = numbers.length-1;
		return numbers[max];

	}

	
}

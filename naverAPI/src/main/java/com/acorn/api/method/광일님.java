package com.acorn.api.method;

public class 광일님 {

	public static void main(String[] args) {
		int[] numbers = { 10, 9, 27, 8, 9 };

		int max = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max)
				max = numbers[i];
		}

		System.out.println(max);

		int max2 = maxNumber(numbers);
		System.out.println(max2);
	}

	public static int maxNumber(int[] numbers) {
		int max = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max)
				max = numbers[i];
		}
		return max;
	}
}

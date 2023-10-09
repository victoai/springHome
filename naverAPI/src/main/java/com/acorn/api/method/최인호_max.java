package com.acorn.api.method;

public class 최인호_max {

	public static void main(String[] args) {
		
		//// int 배열의 요소 중 큰 값 구하기
		//int[] nums={10,9,27,8,9};
		//
		//int max=nums[0];
		//
		//for(int n:nums) {
		//	if(max<n) {
		//		max=n;
		//	}
		//}
		//
		//System.out.println(max);
		
		// 매서드 분리
		getMax();
		
	}

	private static void getMax() {
		int[] nums={10,9,27,8,9};
		
		int max=nums[0];
		
		for(int n:nums) {
			if(max<n) {
				max=n;
			}
		}
		
		System.out.println(max);
	}

}

package com.acorn.api.method;

public class 성혁님 {

	public static void main(String[] args) {
		
		//함수 미사용
		int[] nums = {10,9,27,8,9};
		
		int max = 0;
		
		for(int i=0; i<nums.length; i++) {
			if(max<nums[i]) {
				max = nums[i];
			}
		}
		
		System.out.println(max);
		
		//함수 사용
		int result = max(nums);
		System.out.println(result);
		
	}
	
	public static int max(int[] nums) {
		int max = 0;
		
		for(int i=0; i<nums.length; i++) {
			if(max<nums[i]) {
				max = nums[i];
			}
		}
	
		return max;
	}
}

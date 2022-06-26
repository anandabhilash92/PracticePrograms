package xyz;

import java.util.Arrays;

public class FirstAndLastPositionOfElementiInSortedArray {
	
	public static int[] searchRange(int []nums, int target) {
		 int []op = new int[2];
	        int first=-1;
	        int last=-1;
	        for(int i=0;i<nums.length;i++) {
	        	if(nums[i]==target) {
	        		first=i;
	        		break;
	        	}
	        }
	        for(int j=nums.length-1;j>=0;j--) {
	        	if(nums[j]==target) {
	        		last=j;
	        		break;
	        	}
	        }
	        op[0]=first;
	        op[1]=last;
	        System.out.println(Arrays.toString(op));
	        return op;
	}

	public static void main(String[] args) {

		int []nums = new int[] {5,7,7,8,8,10};
		int target = 8;
		searchRange(nums, target);
	}

}

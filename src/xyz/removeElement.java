package xyz;

import java.util.Arrays;

public class removeElement {
	
	public static int[] removeElement(int []nums, int val) {
		
		int count = 0;
		int []res = new int[nums.length];
        for(int i=0;i<=nums.length-1;i++) {
            if(nums[i]!=val) {
                res[count]=nums[i];
                count++;
            } 
        }
        System.out.println(Arrays.toString(res));
        System.out.println(count);
        return res;
	}

	public static void main(String[] args) {

		int []nums = new int[] {3,2,2,3};
		int val = 3;
		removeElement(nums, val);
	}

}

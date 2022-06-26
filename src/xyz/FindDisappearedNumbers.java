package xyz;

import java.util.*;

public class FindDisappearedNumbers {
	
	public static List<Integer> findDisappearedNumbers(int []nums) {
		
		List<Integer> list1 = new ArrayList<Integer>();
        int len = nums.length;
        Arrays.sort(nums);
        for(int i=1;i<len;i++) {
            if(nums[i]==i) {
                continue;
            } else {
                list1.add(i+1);
                ++i;
            }
        }
        System.out.println(list1);
        return list1;
		
	}

	public static void main(String[] args) {

		int []nums = new int[] {4,3,2,7,8,2,3,1};
		findDisappearedNumbers(nums);
	}

}

package xyz;

import java.util.HashSet;
import java.util.Set;

public class KDivisibleElementsSubarrays {
	
	public static int countDistinct(int []nums, int k, int p) {
		
		Set<String> set = new HashSet<String>();
		
		for(int i=0;i<nums.length;i++) {
			int count=0;
			String s = "";
			for(int j=i;j<nums.length;j++) {
			if(nums[j]%p==0) {
				count++;
			}
			if(count>k) {
				break;
			}
			s=s+nums[j] + " ";
			set.add(s);
		}
		}
		System.out.println(set.size());
		return set.size();
	}

	public static void main(String[] args) {
		
		int []nums = new int[] {2,3,3,2,2};
		int k=2;
		int p=2;
		countDistinct(nums, k, p);
	}

}

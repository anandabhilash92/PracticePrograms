package xyz;

import java.util.Arrays;
import java.util.HashMap;

public class ReplaceElementsInAnArray {
	
	public static int[] arrayChange(int []nums, int [][]operations) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i], i);
		}
		
		for(int op[]:operations) {
			int oldVal = op[0];
			int newVal = op[1];
			int index = map.get(op[0]);
			nums[index] = newVal;
			
			map.put(newVal, index);
			map.remove(oldVal);
		}
		System.out.println(Arrays.toString(nums));
		return nums;
	}

	public static void main(String[] args) {

		int []nums=new int[] {1,2};
		int[][] operations = {{1,3},{2,1},{3,2}};
		arrayChange(nums, operations);
	}

}

package xyz;

public class SingleNumber {
	
	public static int singleNumber(int[] nums) {
		
		int result=0;
		for(int i=0;i<nums.length;i++) {
			result^=nums[i];
		}
		
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {

		int []nums = new int[] {4,1,2,1,2};
		singleNumber(nums);
	}

}

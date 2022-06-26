package xyz;

public class ThirdLargestNumber {

	public static int thirdLargestNum(int[] nums) {

		if (nums.length == 1) {
			System.out.println(nums[0]);
			return nums[0];
		}
		

		if (nums.length == 2) {
			System.out.println(max(nums[0], nums[1]));
			return max(nums[0], nums[1]);
		}

		Integer m1 = null;
		Integer m2 = null;
		Integer m3 = null;
		
		for (Integer i : nums) {

			if (i.equals(m1) || i.equals(m2) || i.equals(m3)) {
				continue;
			}

			if (m1 == null || i > m1) {
				m3 = m2;
				m2 = m1;
				m1 = i;
			} else if (m2 == null || i > m2) {
				m3 = m2;
				m2 = i;
			} else if (m3 == null || i > m3) {
				m3 = i;
			}
		}
		if(m3==null) {
			System.out.println(m1);
			return m1;
		}

		System.out.println(m3);
		return m3;

	}

	public static int max(int i, int j) {
		if (i > j)
			return i;
		else
			return j;
	}

	public static void main(String[] args) {

		int[] nums = new int[] { 1,1,2, };
		thirdLargestNum(nums);
	}

}

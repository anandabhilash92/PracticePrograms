package xyz;

import java.util.Arrays;

public class MaxConsecutive {
	
	public static int maxConsecutive(int bottom, int top, int []special) {
		
		Arrays.sort(special);
			int start = bottom;
			int end = top;
			int ans=0;
			for(int i=0;i<special.length;i++) {
				int specialFloorIndex=special[i];
				int diff = specialFloorIndex-start;
				ans=Math.max(diff, ans);
				start=specialFloorIndex+1;
		}
			ans=Math.max(ans, top-special[special.length-1]);
			System.out.println(ans);
			return ans;
		
	}

	public static void main(String[] args) {
		
		int bottom = 6;
		int top = 8;
		int []special = new int[] {7,6,8};
		maxConsecutive(bottom, top, special);
	}

}

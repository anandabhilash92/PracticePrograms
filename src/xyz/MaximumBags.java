package xyz;

import java.util.Arrays;

public class MaximumBags {
	
	public static int maximumBags(int []capacity, int []rocks, int additionalRocks) {
		
		int []vacancy = new int[rocks.length];
		for(int i=0;i<rocks.length;i++) {
			vacancy[i]=capacity[i]-rocks[i];
		}
		
		Arrays.sort(vacancy);
		int count=0;
		for(int i=0;i<rocks.length;i++) {
			if(vacancy[i]==0) {
				count++;
			} else {
				if (additionalRocks>=vacancy[i]) {
					additionalRocks-=vacancy[i];
					count++;
				}
			}
		}
		System.out.println(count);
		return count;
	}

	public static void main(String[] args) {
		
		int []capacity = new int[] {54,18,91,49,51,45,58,54,47,91,90,20,85,20,90,49,10,84,59,29,40,9,100,1,64,71,30,46,91};
		int []rocks = new int[] {14,13,16,44,8,20,51,15,46,76,51,20,77,13,14,35,6,34,34,13,3,8,1,1,61,5,2,15,18};
		int additionalRocks=77;
		maximumBags(capacity, rocks, additionalRocks);
	}

}

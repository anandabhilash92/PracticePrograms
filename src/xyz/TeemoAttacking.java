package xyz;

import java.util.HashSet;

public class TeemoAttacking {
	
	public static int findPoisonedDuration(int []timeSeries, int duration) {
		 HashSet<Integer> set1 = new HashSet<Integer>();
	        for(int i=0;i<timeSeries.length;i++) {
	            int k=0;
	            for(int j=timeSeries[i];k<duration;j++) {
	                set1.add(j);
	                k++;
	            }
	        }
	        System.out.println(set1.size());
	        return set1.size();
	}

	public static void main(String[] args) {
		
		int []timeSeries = new int[] {1,2,3,4,5,6,7,8,9};
		int duration = 1;
		findPoisonedDuration(timeSeries, duration);
	}

}

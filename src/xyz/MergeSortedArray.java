package xyz;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortedArray {
	
public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
	int p1=m-1, p2=n-1, i=m+n-1;
	while(p2>=0) {
		if(p1>=0 && nums1[p1]>nums2[p2]) {
			nums1[i--]=nums1[p1--];
		} else {
			nums1[i--]=nums2[p2--];
		}
	}
	System.out.println(Arrays.toString(nums1));
    }

	public static void main(String[] args) {

		int []nums1 = new int[] {0};
		int []nums2 = new int[] {1};
		int m = 0;
		int n = nums2.length;
		merge(nums1, m, nums2, n);
	}

}

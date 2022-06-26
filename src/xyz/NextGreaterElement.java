package xyz;

import java.util.Arrays;

public class NextGreaterElement {
	
	public static int[] nextGreaterElement(int []nums1, int []nums2) {
		
		int index = 0;
        int []res = new int[nums1.length];
        for(int m=0;m<res.length;m++) {
            res[m]=-1;
        }
        for(int i=0;i<nums1.length;i++) {
            for(int j=0;j<nums2.length;j++) {
                if(nums1[i]==nums2[j]) {
                    for(int k=j+1;k<nums2.length;k++) {
                        if(nums2[k]>nums2[j]) {
                            res[index]=nums2[k];
                            break;
                        } 
                    }
                    index++;
                }
            }
        }
        System.out.println(Arrays.toString(res));
        return res;
	}

	public static void main(String[] args) {
		
		int []nums1 = new int[] {4,1,2};
		int []nums2 = new int[] {1,3,4,2};
		nextGreaterElement(nums1, nums2);
	}

}

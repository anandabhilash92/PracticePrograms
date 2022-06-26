package xyz;

import java.util.Arrays;

public class ReverseArray {
	
	public static int[] reverse(int []arr, int n) {
		for(int i=0;i<n;i++) {
			int last = arr[arr.length-1];
			for(int j=arr.length-1;j>0;j--) {

			arr[j]=arr[j-1];
			}
			arr[0]=last;
			}
			System.out.println(Arrays.toString(arr));
			return arr;
	}

	public static void main(String[] args) {
		
		int []arr = new int[] {5,7,2,15,4};
		int n = 3;
		reverse(arr, n);
	}

}

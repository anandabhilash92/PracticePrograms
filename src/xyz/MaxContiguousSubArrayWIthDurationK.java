package xyz;

public class MaxContiguousSubArrayWIthDurationK {
	
	public static int maxSum(int arr[], int n, int k) {
		
		int res=0;
		for(int i=0;i<k;i++) {
			res+=arr[i];
		}
		int curr_sum=res;
		for(int i=k;i<n;i++) {
			curr_sum+=arr[i]-arr[i-k];
			res=Math.max(curr_sum, res);
		}
		
		return res;
		
	}

	public static void main(String[] args) {

		int arr[] = {1, 4, 2, 10, 2, 3, 1, 0, 20};
		int k=4;
		int n=arr.length;
		System.out.println(maxSum(arr, n, k));
	}

}

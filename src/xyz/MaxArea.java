package xyz;

public class MaxArea {
	
	public static int maxArea(int []height) {
		
		int res=Integer.MIN_VALUE;
        int prod=0;
        int i=0;
        int j=height.length-1;
        while(i<j) {
            int min = Math.min(height[i], height[j]);
            res=Math.max(res, min*(j-i));
            if(height[i]<height[j]) {
                i++;
            } else {
                j--;
            }
        }
        System.out.println(res);
        return res;
	}

	public static void main(String[] args) {
		
		int []height = new int[] {1,8,6,2,5,4,8,3,7};
		maxArea(height);
	}

}

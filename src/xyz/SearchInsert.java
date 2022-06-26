package xyz;

public class SearchInsert {
	
	public static int searchInsert(int[] nums, int target) {
		 
        int res=0;
        
        if(target<nums[0]) {
            return 0;
            
        }
        
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==target) {
                res=i;
                break;
            }
        }
        if(res==0) {
        	int i=0;
            while(i<nums.length-1) {
                if(nums[i]<target && nums[i+1]>target) {
                    res=i+1;
                    break;
                }
                i++;
            }
            res=i+1;
        }
        
        System.out.println(res);
        return res;
	}

	public static void main(String[] args) {
		
		int []nums = new int[] {1,3,5,6};
		int target = 0;
		searchInsert(nums, target);
	}

}

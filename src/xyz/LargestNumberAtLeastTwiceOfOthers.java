package xyz;

public class LargestNumberAtLeastTwiceOfOthers {
	
	public static int dominantIndex(int []nums) {
	
	int res=-1;
    if(nums.length==1) {
        res=0;
    } else {
    int max=0;
    int sec_max=0;
    if(nums[0]>nums[1]) {
        max=nums[0];
        sec_max=nums[1];
    } else {
        max=nums[1];
        sec_max=nums[0];
    }
    for(int i=2;i<nums.length;i++) {
        if(nums[i]>max) {
        	sec_max=max;
            max=nums[i];
        } else if(nums[i]>sec_max) {
            sec_max=nums[i];
        } 
    }
    if(max>=2*sec_max) {
        int i=0;
        while(i<nums.length) {
            if(nums[i]==max) {
                res=i;
                break;
            } else {
                i++;
            }
        }
    }
    }
    return res;
	}

	public static void main(String[] args) {
		
		int []nums = new int[] {0,0,0,1};
		dominantIndex(nums);
	}

}

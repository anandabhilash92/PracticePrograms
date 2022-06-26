package xyz;

public class CanPlaceFlowers {
	
	public static boolean canPlaceFlowers(int []flowerbed, int n) {
		
		int count = 0;
		for(int i=0;i<flowerbed.length;i++) {
			if(flowerbed[i]==0) {
				int prev = (i==0 || flowerbed[i-1]==0?0:1);
				int next = (flowerbed.length-1==i || flowerbed[i+1]==0)?0:1;
				
				if(prev==0 && next==0) {
					flowerbed[i]=1;
					count++;
				}
			}
		}
		System.out.println(count>=n);
        return count>=n;
	}

	public static void main(String[] args) {
		
		int []flowerbed = new int[] {1,0};
		int n=1;
		canPlaceFlowers(flowerbed, n) ;
	}

}

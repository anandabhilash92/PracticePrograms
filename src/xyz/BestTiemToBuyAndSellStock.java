package xyz;

public class BestTiemToBuyAndSellStock {
	
	public static int maxProfit(int[] prices) {
		int min=prices[0];
        int diff=0;
        int res=0;
        for(int i=1;i<prices.length;i++) {
            if(prices[i]<min) {
                min=prices[i];
            }
            if(prices[i]>min) {
                diff=prices[i]-min;
            }
            if(diff>res) {
                res=diff;
            }
        } 
        System.out.println(res);
        return res; 
        }
    

	public static void main(String[] args) {
		
		int []prices = new int[] {7,1,5,3,6,4};
		maxProfit(prices);
	}

}

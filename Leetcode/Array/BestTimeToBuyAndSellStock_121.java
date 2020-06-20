package leetcode.Array;

public class BestTimeToBuyAndSellStock_121 {
	   public int maxProfit(int[] prices) {
		   if(prices.length == 0) {
			   return 0;
		   }
		   int minValue = Integer.MAX_VALUE, maxProfit = 0; 
		   for(int i = 0; i< prices.length; i++) {
			   if(minValue > prices[i])
				   minValue = prices[i];
			   else if(prices[i] - minValue > maxProfit) {
				   maxProfit = prices[i] - minValue;
			   }
		   }
		   return maxProfit;
		   
	   }
public static void main(String[] args) {
	BestTimeToBuyAndSellStock_121 stock = new BestTimeToBuyAndSellStock_121();
	int[] arr = {7,1,5,3,6,4};
	int maxProfit = stock.maxProfit(arr);
	System.out.print("Maximum Profit = "+maxProfit);
}
}

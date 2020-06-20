package leetcode.Array;

public class BestTimeToBuyAndSellStockII_122 {
	public int maxProfit(int[] prices) {
		int maxProfit = 0;
		for(int i = 1; i < prices.length; i++) {
			if(prices[i] - prices[i-1] > 0) {
				maxProfit += prices[i] - prices[i-1];
			}
		}
		return maxProfit;
	}
	public static void main(String[] args) {
		BestTimeToBuyAndSellStockII_122 stock = new BestTimeToBuyAndSellStockII_122();
		int[] arr = {7,1,5,3,6,4};
		int maxProfit = stock.maxProfit(arr);
		System.out.print("Maximum Profit = "+maxProfit);
	}
}

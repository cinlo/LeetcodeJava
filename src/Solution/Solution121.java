package Solution;

public class Solution121 {
    public int maxProfit(int[] prices) {
        if(prices.length == 1) return 0;

        int i = 0;
        int buy = prices[0], sell = prices[0], profit = sell - buy;

        for(int j = 1; j <prices.length; j++){
            if(prices[j] > sell) sell = prices[j];
            if(prices[i] < buy) {
                profit = Math.max(profit, sell - buy);
                buy = prices[i];
                sell = prices[i];
            }
        }
    }
}

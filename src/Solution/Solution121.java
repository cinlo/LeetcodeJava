package Solution;

public class Solution121 {
    public int maxProfit(int[] prices) {
        if(prices.length == 1) return 0;

        int i = 0;
        int buy = prices[0], profit = 0;

        for(int j = 1; j <prices.length; j++){
            profit = Math.max(profit, prices[j] - buy);
            buy = Math.min(buy, prices[j]);
        }
        return profit;
    }
}

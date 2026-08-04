class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int sellDay = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[sellDay]) {
                sellDay = i;
            }

            maxProfit = Math.max(maxProfit, prices[i] - prices[sellDay]);
        }

        return maxProfit;

    }
}

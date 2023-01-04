public class Problem121_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for (int p : prices) {
            if (min > p) {
                min = p;
            } else if (p - min > profit) {
                profit = p - min;
            }
        }
        return profit;
    }
}

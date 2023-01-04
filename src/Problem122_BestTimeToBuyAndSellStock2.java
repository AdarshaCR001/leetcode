public class Problem122_BestTimeToBuyAndSellStock2 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = prices[0];
        int sum = 0;
        int prev = prices[0];
        for (int i : prices) {
            if (prev < i) {
                if (i < min) {
                    min = i;
                } else if (sum < i - min) {
                    sum = i - min;
                }
            } else {
                min = i;
                maxProfit += sum;
                sum = 0;
            }
            prev = i;
        }
        return maxProfit + sum;
    }
}

import java.util.Arrays;

public class Problem1833_MaximumIceCreamBars {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;
        for (int i : costs) {
            if (coins == 0 || i > coins) {
                break;
            }
            coins -= i;
            count++;
        }
        return count;
    }
}

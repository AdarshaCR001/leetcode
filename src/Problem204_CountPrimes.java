import java.util.HashMap;
import java.util.Map;

public class Problem204_CountPrimes {
    Map<Integer, Integer> primerCount = new HashMap<>();

    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                for (int j = 2 * i; j <= n; j = j + i) {
                    isPrime[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        return count;
    }
}

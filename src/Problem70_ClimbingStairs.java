import java.util.HashMap;
import java.util.Map;

public class Problem70_ClimbingStairs {
    Map<Integer, Integer> ways = new HashMap<>();

    public int climbStairs(int n) {
        ways.put(1, 1);
        ways.put(2, 2);
        return fib(n);
    }

    private int fib(int n) {
        if (ways.containsKey(n)) {
            return ways.get(n);
        }
        int sum = fib(n - 1) + fib(n - 2);
        ways.put(n, sum);
        return ways.get(n);
    }
}

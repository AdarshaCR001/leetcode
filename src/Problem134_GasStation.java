import java.util.Arrays;

public class Problem134_GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasSum = Arrays.stream(gas).sum();
        int costSum = Arrays.stream(cost).sum();

        if (costSum > gasSum) {
            return -1;
        }

        int pos = -1;
        int maxDif = -1;
        int point = 0;
        for (int i = 0; i < gas.length; i++) {
            point += gas[i] - cost[i];
            if (point < 0) {
                pos = -1;
                point = 0;
            } else {
                if (pos == -1) {
                    pos = i;
                    point = gas[i] - cost[i];
                }
            }
        }
        return pos;
    }
}

import java.util.HashMap;
import java.util.Map;

public class Problem2244_MinimumRoundsToCompleteAllTasks {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int i : tasks) {
            numbers.put(i, numbers.getOrDefault(i, 0) + 1);
        }
        int taskRounds = 0;
        for (int n : numbers.values()) {
            if (n == 1) {
                return -1;
            }
            taskRounds += n / 3;
            int rem = n % 3;
            if (rem != 0) {
                taskRounds++;
            }
        }
        return taskRounds;
    }
}

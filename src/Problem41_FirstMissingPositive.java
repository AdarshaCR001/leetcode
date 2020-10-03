import java.util.HashSet;
import java.util.Set;

public class Problem41_FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> unique = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int p = nums[i];
            if (p > 0 && !unique.contains(p)) {
                unique.add(p);
            }
        }

        int i = 1;
        while (unique.contains(i)) {
            i++;
        }
        return i;
    }
}

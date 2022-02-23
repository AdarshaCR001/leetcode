import java.util.HashMap;
import java.util.Map;

public class Problem219_ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> unique = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (unique.containsKey(nums[i])) {
                if (Math.abs(i - unique.get(nums[i])) <= k) {
                    return true;
                }
            }
            unique.put(nums[i], i);
        }
        return false;
    }
}

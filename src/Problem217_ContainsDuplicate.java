import java.util.HashSet;
import java.util.Set;

public class Problem217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (unique.contains(nums[i])) {
                return true;
            }
            unique.add(nums[i]);
        }
        return false;
    }
}

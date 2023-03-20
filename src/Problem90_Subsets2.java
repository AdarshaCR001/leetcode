import java.util.*;
import java.util.stream.Collectors;

public class Problem90_Subsets2 {
    Set<List<Integer>> result = new LinkedHashSet<>();
    int[] nums;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        this.nums = nums;
        result.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            combine(new ArrayList<>(), i);
        }
        return result.stream().collect(Collectors.toList());
    }

    private void combine(List<Integer> array, int pos) {
        array.add(nums[pos]);
        result.add(array);
        for (int i = pos + 1; i < nums.length; i++) {
            combine(new ArrayList<>(array), i);
        }
    }
}

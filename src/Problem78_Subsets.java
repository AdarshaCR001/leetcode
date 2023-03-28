import java.util.ArrayList;
import java.util.List;

public class Problem78_Subsets {
    List<List<Integer>> result = new ArrayList<>();
    int[] nums;

    public List<List<Integer>> subsets(int[] nums) {
        this.nums = nums;
        result.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            combine(new ArrayList<>(), i);
        }
        return result;
    }

    private void combine(List<Integer> array, int pos) {
        array.add(nums[pos]);
        result.add(array);
        for (int i = pos + 1; i < nums.length; i++) {
            combine(new ArrayList<>(array), i);
        }
    }
}

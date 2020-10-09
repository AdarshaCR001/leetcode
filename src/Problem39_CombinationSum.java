import java.util.ArrayList;
import java.util.List;

public class Problem39_CombinationSum {
    private List<List<Integer>> list = new ArrayList();
    private int[] candidates;
    private int target;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.candidates = candidates;
        this.target = target;
        for (int i = 0; i < candidates.length; i++)
            sum(new ArrayList<>(), i);
        return list;
    }

    public void sum(List<Integer> nums, int index) {
        int res = nums.stream().reduce(0, Integer::sum) + candidates[index];
        if (res > target) {
            return;
        }
        nums.add(candidates[index]);
        if (res == target) {
            list.add(nums);
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            sum(new ArrayList<>(nums), i);
        }
    }
}

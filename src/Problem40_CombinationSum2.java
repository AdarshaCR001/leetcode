import java.util.*;
import java.util.stream.Collectors;

public class Problem40_CombinationSum2 {
    int[] candidates;
    int target;
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        this.candidates = candidates;
        this.target = target;
        combinationSumUtil(new ArrayList<>(), 0, 0);
        return result;
    }

    private void combinationSumUtil(List<Integer> list, int index, int sum) {
        if (sum > target) {
            return;
        }
        if (sum == target) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (i != index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if (candidates[i] > target - sum) {
                break;
            }
            int n = candidates[i];
            list.add(n);
            sum += n;
            combinationSumUtil(list, i + 1, sum);
            sum -= n;
            list.remove(list.size() - 1);
        }
    }
}

import java.util.ArrayList;
import java.util.List;

public class Problem46_Permutations {
    List<List<Integer>> solution = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            a.add(nums[i]);
        }
        perm(new ArrayList<>(), a);
        return solution;
    }

    public void perm(List<Integer> s, List<Integer> numbers) {
        if (numbers.size() == 0) {
            solution.add(s);
            return;
        }
        for (int i = 0; i < numbers.size(); i++) {
            List<Integer> remainingNumbers = new ArrayList<>(numbers);
            List<Integer> s1 = new ArrayList<>(s);
            s1.add(remainingNumbers.remove(i));
            perm(s1, remainingNumbers);
        }
    }
}

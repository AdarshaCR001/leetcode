import java.util.ArrayList;
import java.util.List;

public class Problem77_Combinations {
    int n;
    int k;
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        this.n = n;
        this.k = k;
        for (int i = 1; i <= n; i++) {
            combine(new ArrayList<>(), i);
        }
        return result;
    }

    private void combine(List<Integer> array, int next) {
        array.add(next);
        if (array.size() == k) {
            result.add(array);
            return;
        }
        for (int i = next + 1; i <= n; i++) {
            combine(new ArrayList<>(array), i);
        }
    }
}

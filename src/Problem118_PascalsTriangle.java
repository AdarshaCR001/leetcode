import java.util.ArrayList;
import java.util.List;

public class Problem118_PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> prev = null;
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            int prevNum = 0;
            if (prev != null) {
                for (int j = 0; j < i; j++) {
                    int sum = prevNum + prev.get(j);
                    list.add(sum);
                    prevNum = prev.get(j);
                }
            }
            list.add(1);
            prev = list;
            l.add(list);
        }
        return l;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Problem119_PascalsTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev = null;
        for (int i = 0; i <= rowIndex; i++) {
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
        }
        return prev;
    }
}

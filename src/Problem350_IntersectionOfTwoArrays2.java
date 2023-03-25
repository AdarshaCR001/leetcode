import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem350_IntersectionOfTwoArrays2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> first = new HashMap<>();
        for (int i : nums1) {
            int count = 1;
            if (first.containsKey(i)) {
                count += first.get(i);
            }
            first.put(i, count);
        }
        List<Integer> result = new ArrayList<>();
        for (int i : nums2) {
            if (first.containsKey(i)) {
                int count = first.get(i) - 1;
                if (count <= 0) {
                    first.remove(i);
                } else {
                    first.put(i, count);
                }
                result.add(i);
            }
        }
        int[] output = new int[result.size()];
        int k = 0;
        while (k < result.size()) {
            output[k] = result.get(k);
            k++;
        }
        return output;
    }
}

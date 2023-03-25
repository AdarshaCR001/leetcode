import java.util.HashSet;
import java.util.Set;

public class Problem349_IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> unique = new HashSet<>();
        for (int i : nums1) {
            unique.add(i);
        }
        Set<Integer> result = new HashSet<>();
        for (int i : nums2) {
            if (unique.contains(i)) {
                result.add(i);
            }
        }
        int[] output = new int[result.size()];
        int k = 0;
        for (int i : result) {
            output[k++] = i;
        }
        return output;
    }
}

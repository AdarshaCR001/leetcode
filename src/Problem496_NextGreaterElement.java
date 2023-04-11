import java.util.HashMap;
import java.util.Map;

public class Problem496_NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i);
        }
        int i = 0;
        for (int num1 : nums1) {
            int greaterElement = -1;
            for (int j = map.get(num1) + 1; j < nums2.length; j++) {
                if (nums2[j] > num1) {
                    greaterElement = nums2[j];
                    break;
                }
            }
            result[i++] = greaterElement;
        }
        return result;
    }
}

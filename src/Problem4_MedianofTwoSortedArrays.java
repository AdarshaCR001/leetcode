import java.util.ArrayList;
import java.util.List;

public class Problem4_MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> res = new ArrayList<>();
        int i = 0, j = 0;
        while (i < nums1.length || j < nums2.length) {
            if (i < nums1.length && j >= nums2.length) {
                res.add(nums1[i]);
                i++;
            } else if (i >= nums1.length) {
                res.add(nums2[j]);
                j++;
            } else if (nums1[i] <= nums2[j]) {
                res.add(nums1[i]);
                i++;
            } else {
                res.add(nums2[j]);
                j++;
            }
        }
        double median;
        if (res.size() % 2 != 0) {
            median = res.get(res.size() / 2);
        } else {
            median = (double) (res.get(res.size() / 2 - 1) + res.get(res.size() / 2)) / 2;
        }
        return median;
    }
}

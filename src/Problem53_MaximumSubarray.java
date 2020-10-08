public class Problem53_MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int sum = 0, max = 0, highest = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (highest < nums[i]) {
                highest = nums[i];
            }
            if (nums[i] + sum >= 0) {
                sum += nums[i];
            } else {
                if (max < sum)
                    max = sum;
                sum = 0;
            }
            if (max < sum)
                max = sum;
        }
        if (max > 0)
            return max;
        else
            return highest;
    }
}

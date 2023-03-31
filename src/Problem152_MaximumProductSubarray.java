public class Problem152_MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int allTimeMax = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int max = nums[i];
            if (max > allTimeMax) {
                allTimeMax = max;
            }
            for (int j = i + 1; j < nums.length; j++) {
                max *= nums[j];
                if (max > allTimeMax) {
                    allTimeMax = max;
                }
            }
        }
        return allTimeMax;
    }
}

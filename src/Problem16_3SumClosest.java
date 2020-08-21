public class Problem16_3SumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int nearest = 0;
        int diff = -1;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == target) {
                        return target;
                    }
                    int tempdiff = Math.abs(target - (nums[i] + nums[j] + nums[k]));
                    if (diff == -1) {
                        diff = tempdiff;
                        nearest = nums[i] + nums[j] + nums[k];
                    }
                    if (tempdiff < diff) {
                        diff = tempdiff;
                        nearest = nums[i] + nums[j] + nums[k];
                    }
                }
            }
        }
        return nearest;
    }
}

public class Problem485_MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;
        for (int i : nums) {
            if (i == 0) {
                if (count > maxCount) {
                    maxCount = count;
                }
                count = 0;
            } else {
                count++;
            }
        }
        if (count > maxCount) {
            maxCount = count;
        }
        return maxCount;
    }
}

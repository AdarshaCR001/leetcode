public class Problem27_RemoveElement {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i - count] = nums[i];
            if (val == nums[i]) {
                count++;
            }

        }
        return nums.length - count;
    }
}

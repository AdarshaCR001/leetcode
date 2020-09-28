public class Problem26_RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int length = 0, i = 1;
        while (i < nums.length) {
            if (nums[length] != nums[i]) {
                nums[++length] = nums[i];
            }
            i++;
        }
        return length + 1;
    }
}

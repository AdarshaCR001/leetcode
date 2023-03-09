public class Problem75_SortColors {
    public void sortColors(int[] nums) {
        int n = nums.length;
        //Using Insertion Sort
        for (int i = 1; i < n; i++) {
            int num = nums[i];
            int j = i - 1;
            while (j >= 0 && num < nums[j]) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = num;
        }
    }
}

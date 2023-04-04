public class Problem303_RangeSumQueryImmutable {
    int[] array;

    public Problem303_RangeSumQueryImmutable(int[] nums) {
        array = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += array[i];
        }
        return sum;
    }
}

public class Problem189_RotateArray {
    public void rotate(int[] nums, int k) {
        int size = nums.length;
        k = k % size;
        if (k <= size / 2) {
            rotateRight(nums, k, size);
        } else {
            k = size - k;
            rotateLeft(nums, k, size);
        }
    }

    private void rotateRight(int[] nums, int k, int size) {
        int temp[] = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = nums[i];
        }
        for (int i = size - 1; i >= 0; i--) {
            int pos = (i + k) % size;
            nums[pos] = nums[i];
        }
        for (int i = 0; i < k; i++) {
            int pos = (i + k) % size;
            nums[pos] = temp[i];
        }
    }


    private void rotateLeft(int[] nums, int k, int size) {
        int temp[] = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = nums[size - k + i];
        }
        for (int i = 0; i < size; i++) {
            int pos = i - k;
            if (pos < 0) {
                pos = size + pos;
            }
            nums[pos] = nums[i];
        }
        for (int i = 0; i < k; i++) {
            int pos = (size - k + i) - k;
            nums[pos] = temp[i];
        }
    }
}

public class Problem34_FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1, -1};
        int size = nums.length;
        int low = 0, high = size - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                int first = mid;
                while (first >= 0 && nums[first] == target) {
                    res[0] = first;
                    first--;
                }
                int last = mid;
                while (last < size && nums[last] == target) {
                    res[1] = last;
                    last++;
                }
                break;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }
}

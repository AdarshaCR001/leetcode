import helper.TreeNode;

public class Problem108_ConvertSortedArrayToBinarySearchTree {
    int[] nums;

    public TreeNode sortedArrayToBST(int[] nums) {
        this.nums = nums;
        return createBst(0, nums.length - 1);
    }

    private TreeNode createBst(int low, int high) {
        if (low > high) {
            return null;
        }
        int mid = (low + high) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = createBst(low, mid - 1);
        root.right = createBst(mid + 1, high);
        return root;
    }
}

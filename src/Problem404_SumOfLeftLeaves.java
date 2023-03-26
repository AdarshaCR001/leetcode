import helper.TreeNode;

public class Problem404_SumOfLeftLeaves {
    int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        sum(root, false);
        return sum;
    }

    private void sum(TreeNode root, boolean isLeft) {
        if (isLeft) {
            if (root.left == null && root.right == null) {
                sum += root.val;
            }
        }
        if (root.left != null) {
            sum(root.left, true);
        }
        if (root.right != null) {
            sum(root.right, false);
        }
    }
}

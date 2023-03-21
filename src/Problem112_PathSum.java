import helper.TreeNode;

public class Problem112_PathSum {
    int targetSum;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        this.targetSum = targetSum;
        return hasPathSumUtil(root, 0);
    }

    private boolean hasPathSumUtil(TreeNode root, int currentSum) {
        if (root == null) {
            return false;
        }
        currentSum += root.val;
        if (currentSum == targetSum && root.left == null && root.right == null) {
            return true;
        }
        return hasPathSumUtil(root.left, currentSum) || hasPathSumUtil(root.right, currentSum);
    }
}

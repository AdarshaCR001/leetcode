import helper.TreeNode;

public class Problem129_SumRootToLeafNumbers {
    private int result = 0;

    public int sumNumbers(TreeNode root) {
        sum(root, 0);
        return result;
    }

    private void sum(TreeNode root, int pathSum) {
        if (root == null) {
            return;
        }
        pathSum = pathSum * 10 + root.val;
        if (root.left == null && root.right == null) {
            result += pathSum;
            return;
        }
        sum(root.left, pathSum);
        sum(root.right, pathSum);
    }
}

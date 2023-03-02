import helper.TreeNode;

public class Problem101_SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root != null) {
            return isSymmetricUtil(root.left, root.right);
        }
        return true;
    }

    private boolean isSymmetricUtil(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left != null && right != null
                && left.val == right.val) {
            return (isSymmetricUtil(left.left, right.right)
                    && isSymmetricUtil(left.right, right.left));
        }
        return false;
    }
}

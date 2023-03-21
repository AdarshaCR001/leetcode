import helper.TreeNode;

public class Problem111_MinimumDepthOfBinaryTree {
    private int depth = 0;

    public int minDepth(TreeNode root) {
        minDepth(root, 1);
        return depth;
    }

    private void minDepth(TreeNode root, int d) {
        if (depth < d && depth != 0) {
            return;
        }
        if (root != null) {
            if (root.left == null && root.right == null) {
                if (depth == 0 || depth > d) {
                    depth = d;
                }
                return;
            }
            minDepth(root.left, d + 1);
            minDepth(root.right, d + 1);
        }
    }
}

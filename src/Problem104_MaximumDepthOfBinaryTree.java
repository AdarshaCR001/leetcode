import helper.TreeNode;

public class Problem104_MaximumDepthOfBinaryTree {
    int maxDepth = 0;

    public int maxDepth(TreeNode root) {
        updateMaxDepth(root, 1);
        return maxDepth;
    }

    private void updateMaxDepth(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (maxDepth < depth) {
            maxDepth = depth;
        }
        updateMaxDepth(root.left, depth + 1);
        updateMaxDepth(root.right, depth + 1);
    }
}

import helper.TreeNode;

public class Problem226_InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        invertUtil(root);
        return root;
    }

    private void invertUtil(TreeNode root) {
        if (root != null) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            invertUtil(root.left);
            invertUtil(root.right);
        }
    }
}

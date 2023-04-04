import helper.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Problem257_BinaryTreePaths {
    private List<String> result = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        if (root != null) {
            binaryTreePaths(root, new StringBuilder());
        }
        return result;
    }

    private void binaryTreePaths(TreeNode root, StringBuilder path) {
        if (path.isEmpty()) {
            path.append(root.val);
        } else {
            path.append("->" + root.val);
        }
        if (root.left == null && root.right == null) {
            result.add(path.toString());
            return;
        }
        if (root.left != null) {
            binaryTreePaths(root.left, new StringBuilder(path));
        }
        if (root.right != null) {
            binaryTreePaths(root.right, new StringBuilder(path));
        }
    }
}

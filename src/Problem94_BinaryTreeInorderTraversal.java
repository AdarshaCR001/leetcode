import helper.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Problem94_BinaryTreeInorderTraversal {
    List<Integer> inOrder = new ArrayList<Integer>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return inOrder;
        }
        inorderTraversal(root.left);
        inOrder.add(root.val);
        inorderTraversal(root.right);
        return inOrder;
    }
}

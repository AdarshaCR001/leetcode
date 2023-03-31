import helper.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Problem199_BinaryTreeRightSideView {
    List<Integer> result = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        rightSideView(root, 0);
        return result;
    }

    private void rightSideView(TreeNode root, int pos) {
        if (root == null) {
            return;
        }
        if (result.size() == pos) {
            result.add(root.val);
        }
        pos++;
        rightSideView(root.right, pos);
        rightSideView(root.left, pos);
    }
}

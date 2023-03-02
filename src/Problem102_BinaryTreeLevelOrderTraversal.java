import helper.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem102_BinaryTreeLevelOrderTraversal {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        levelOrderUtil(queue);
        return result;
    }

    private void levelOrderUtil(Queue<TreeNode> queue) {
        if (!queue.isEmpty()) {
            Queue<TreeNode> newQueue = new LinkedList<>();
            List<Integer> level = new ArrayList<>();
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (node != null) {
                    level.add(node.val);
                    newQueue.add(node.left);
                    newQueue.add(node.right);
                }
            }
            if (!level.isEmpty()) {
                result.add(level);
            }
            levelOrderUtil(newQueue);
        }
    }
}

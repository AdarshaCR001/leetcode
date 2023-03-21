import helper.TreeNode;

import java.util.*;

public class Problem103_BinaryTreeZigzagLevelOrderTraversal {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root != null) {
            Deque<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            traverse(queue, true);
        }
        return result;
    }

    private void traverse(Deque<TreeNode> queue, boolean isLeft) {
        if (!queue.isEmpty()) {
            Deque<TreeNode> newQueue = new LinkedList<>();
            List<Integer> order = new ArrayList<>();
            if (isLeft) {
                Iterator<TreeNode> iterator = queue.iterator();
                while (iterator.hasNext()) {
                    TreeNode root = iterator.next();
                    order.add(root.val);
                }
            } else {
                Iterator<TreeNode> iterator = queue.descendingIterator();
                while (iterator.hasNext()) {
                    TreeNode root = iterator.next();
                    order.add(root.val);
                }
            }
            while (!queue.isEmpty()) {
                TreeNode root = queue.removeFirst();
                if (root.left != null) {
                    newQueue.add(root.left);
                }
                if (root.right != null) {
                    newQueue.add(root.right);
                }
            }
            result.add(order);
            traverse(newQueue, !isLeft);
        }
    }
}

import helper.Node;

import java.util.LinkedList;
import java.util.Queue;

public class Problem116_PopulatingNextRightPointersInEachNode {
    public Node connect(Node root) {
        if (root != null) {
            Queue<Node> newQueue = new LinkedList<>();
            newQueue.add(root);
            connectUtil(newQueue);
        }
        return root;
    }

    private void connectUtil(Queue<Node> queue) {
        if (!queue.isEmpty()) {
            Queue<Node> newQueue = new LinkedList<>();
            Node prev = null;
            while (!queue.isEmpty()) {
                if (prev == null) {
                    prev = queue.poll();
                } else {
                    prev.next = queue.poll();
                    prev = prev.next;
                }
                if (prev.left != null) {
                    newQueue.add(prev.left);
                }
                if (prev.right != null) {
                    newQueue.add(prev.right);
                }
            }
            connectUtil(newQueue);
        }
    }
}

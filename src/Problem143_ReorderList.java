import helper.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Problem143_ReorderList {
    public void reorderList(ListNode head) {
        Deque<ListNode> queue = new ArrayDeque<>();
        boolean isOdd = true;
        ListNode node = head;
        while (node != null) {
            queue.add(node);
            node = node.next;
        }
        head = null;
        while (!queue.isEmpty()) {
            ListNode first = queue.removeFirst();
            first.next = null;
            if (head != null) {
                head.next = first;
                head = head.next;
            } else {
                head = first;
            }
            if (!queue.isEmpty()) {
                ListNode last = queue.removeLast();
                last.next = null;
                head.next = last;
                head = head.next;
            }
        }
    }
}

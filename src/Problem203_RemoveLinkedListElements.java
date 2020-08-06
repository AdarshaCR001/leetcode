import helper.ListNode;

public class Problem203_RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = null;
        ListNode newHead = null;
        while (head != null) {
            if (head.val != val) {
                if (newHead == null) {
                    newHead = head;
                    prev = head;
                } else {
                    prev.next = head;
                    prev = prev.next;
                }
            }
            head = head.next;
            if (prev != null) {
                prev.next = null;
            }
        }
        return newHead;
    }
}

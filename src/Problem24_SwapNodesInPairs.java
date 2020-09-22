import helper.ListNode;

public class Problem24_SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            ListNode temp = cur.next;
            cur.next = temp.next;
            temp.next = cur;
            if (prev == null) {
                head = temp;
            } else {
                prev.next = temp;
            }
            prev = cur;
            cur = cur.next;
        }

        return head;
    }
}

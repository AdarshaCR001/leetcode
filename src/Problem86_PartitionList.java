import helper.ListNode;

public class Problem86_PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode minHead = null;
        ListNode minTail = null;
        ListNode maxHead = null;
        ListNode maxTail = null;
        while (head != null) {
            ListNode next = head.next;
            if (head.val < x) {
                if (minHead == null) {
                    minHead = head;
                    minTail = head;
                } else {
                    minTail.next = head;
                    minTail = minTail.next;
                }
                minTail.next = null;
            } else {
                if (maxHead == null) {
                    maxHead = head;
                    maxTail = head;
                } else {
                    maxTail.next = head;
                    maxTail = maxTail.next;
                }
                maxTail.next = null;
            }
            head = next;
        }
        if (minTail != null) {
            minTail.next = maxHead;
        } else {
            minHead = maxHead;
        }
        return minHead;
    }
}

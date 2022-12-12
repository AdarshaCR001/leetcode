import helper.ListNode;

public class Problem83_RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev = null;
        ListNode start = head;
        while (start != null && start.next != null) {
            ListNode next = start.next;
            if (start.val == next.val) {
                if (prev == null) {
                    head = head.next;
                    start = start.next;
                } else {
                    prev.next = next;
                    start = prev.next;
                }
            } else {
                prev = start;
                start = next;
            }
        }
        return head;
    }
}

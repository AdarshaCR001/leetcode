import helper.ListNode;

public class Problem206_ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode last = null;
        while (head != null) {
            ListNode next = head.next;
            if (last == null) {
                last = head;
                last.next = null;
            } else {
                ListNode temp = last;
                last = head;
                last.next = temp;
            }
            head = next;
        }
        return last;
    }
}

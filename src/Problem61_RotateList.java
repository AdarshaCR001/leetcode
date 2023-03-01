import helper.ListNode;

public class Problem61_RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode result = head;
        if (head != null) {
            ListNode last = head;
            int count = 1;
            while (last.next != null) {
                last = last.next;
                count++;
            }
            last.next = head;
            k = count - (k % count);
            while (k > 1) {
                head = head.next;
                k--;
            }
            result = head.next;
            head.next = null;
        }
        return result;
    }
}

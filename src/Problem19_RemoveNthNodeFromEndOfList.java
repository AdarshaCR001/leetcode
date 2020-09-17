import helper.ListNode;

public class Problem19_RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int length = 0;
        while (temp != null) {
            temp = temp.next;
            length++;
        }

        n = length - n;
        if (n == 0)
            return head.next;

        ListNode prev = head;
        ListNode cur = head;
        int i = 0;
        while (i < n) {
            prev = cur;
            cur = cur.next;
            i++;
        }
        prev.next = cur.next;
        return head;
    }
}

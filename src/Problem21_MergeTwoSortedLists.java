import helper.ListNode;

public class Problem21_MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null)
            return null;
        ListNode sortedList = new ListNode();

        ListNode head = sortedList;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                sortedList.val = l1.val;
                l1 = l1.next;
            } else {
                sortedList.val = l2.val;
                l2 = l2.next;
            }
            sortedList.next = new ListNode();
            sortedList = sortedList.next;
        }
        if (l1 != null) {

            sortedList.val = l1.val;
            sortedList.next = l1.next;
        } else if (l2 != null) {
            sortedList.val = l2.val;
            sortedList.next = l2.next;
        }
        return head;
    }
}

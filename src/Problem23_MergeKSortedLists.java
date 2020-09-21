import helper.ListNode;

public class Problem23_MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {

        if (lists.length == 0) {
            return null;
        }
        ListNode sortedList = lists[0];
        for (int i = 1; i < lists.length; i++) {
            sortedList = mergeTwoLists(sortedList, lists[i]);
        }

        return sortedList;
    }

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

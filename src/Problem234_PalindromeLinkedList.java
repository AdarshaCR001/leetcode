import helper.ListNode;

public class Problem234_PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode middle = head, last = head;
        while (last != null && last.next != null) {
            middle = middle.next;
            last = last.next.next;
        }
        ListNode prev = middle;
        middle = middle.next;
        prev.next = null;
        while (middle != null) {
            ListNode temp = middle;
            middle = middle.next;
            temp.next = prev;
            prev = temp;
        }
        last = prev;
        while (last != null) {
            if (head.val != last.val) {
                return false;
            }
            head = head.next;
            last = last.next;
        }
        return true;
    }
}

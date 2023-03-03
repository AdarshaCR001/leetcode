import helper.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Problem160_IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> unique = new HashSet<>();
        while (headA != null) {
            unique.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (unique.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}

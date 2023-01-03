import helper.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Problem142_LinkedListCycle2 {
    Set<ListNode> uniqueNodes=new HashSet<>();
    public ListNode detectCycle(ListNode head) {
        if(head==null){
            return head;
        }
        if(uniqueNodes.contains(head)){
            return head;
        }
        uniqueNodes.add(head);
        return detectCycle(head.next);
    }
}

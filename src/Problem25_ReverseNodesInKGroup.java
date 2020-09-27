import helper.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Problem25_ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode cur = head;

        List<ListNode> l = new ArrayList();

        while (cur != null) {
            ListNode temp = cur;
            cur = cur.next;
            l.add(temp);
        }

        cur = null;
        int l1 = 0;
        for (int i = 0; i < l.size(); i++) {
            if (i % k == 0) {
                l1 += 1;
                if ((l1 * k - i % k) - 1 > l.size() - 1) {
                    cur.next = l.get(i);
                    break;
                }
            }
            if (cur != null) {
                cur.next = l.get((l1 * k - i % k) - 1);
                cur = cur.next;
                cur.next = null;
            } else {
                cur = l.get((l1 * k - i % k) - 1);
                head = cur;
            }
        }
        return head;
    }
}

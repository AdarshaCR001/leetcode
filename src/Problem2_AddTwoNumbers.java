import java.math.BigInteger;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Problem2_AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        BigInteger sum3 = getNumber(l1).add(getNumber(l2));

        BigInteger b[] = sum3.divideAndRemainder(new BigInteger("10"));

        ListNode l3 = new ListNode(b[1].intValue());

        setNode(l3, b[0]);

        return l3;

    }

    public BigInteger getNumber(ListNode l1) {
        if (l1.next == null) {
            return new BigInteger(String.valueOf(l1.val));
        }
        return (getNumber(l1.next).multiply(new BigInteger("10"))).add(new BigInteger(String.valueOf(l1.val)));
    }

    public void setNode(ListNode p, BigInteger num) {
        if (num.signum() != 0) {
            BigInteger b[] = num.divideAndRemainder(new BigInteger("10"));
            ListNode c = new ListNode(b[1].intValue());
            p.next = c;
            setNode(c, b[0]);
        }
    }
}

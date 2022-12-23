import java.util.ArrayList;
import java.util.List;

public class Problem225_ImplementStackUsingQueues {
    int top = -1;
    List<Integer> q;

    public Problem225_ImplementStackUsingQueues() {
        q = new ArrayList<>();
    }

    public void push(int x) {
        q.add(x);
        top++;
    }

    public int pop() {
        return q.remove(top--);
    }

    public int top() {
        return q.get(top);
    }

    public boolean empty() {
        return top == -1;
    }
}

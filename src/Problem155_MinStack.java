import java.util.ArrayList;
import java.util.List;

public class Problem155_MinStack {
    int top;
    List<Integer> l = new ArrayList();

    public Problem155_MinStack() {
        top = -1;
    }

    public void push(int x) {
        l.add(x);
        ++top;
        //n[++top]=x;
    }

    public void pop() {
        l.remove(top);
        --top;
    }

    public int top() {
        return l.get(top);
    }

    public int getMin() {
        int min = l.get(0);
        for (int i = 1; i < l.size(); i++) {
            if (min > l.get(i)) {
                min = l.get(i);
            }
        }
        return min;
    }
}

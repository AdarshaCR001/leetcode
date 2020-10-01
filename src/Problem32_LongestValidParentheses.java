import java.util.Stack;

public class Problem32_LongestValidParentheses {
    public int longestValidParentheses(String s) {
        int top = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    if (i - stack.peek() > top) {
                        top = i - stack.peek();
                    }
                }
            }
        }
        return top;
    }
}

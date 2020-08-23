import java.util.Stack;

public class Problem20_ValidParentheses {
    public boolean isValid(String s) {
        int size = s.length();
        Stack<Character> stacks = new Stack<>();
        for (int i = 0; i < size; i++) {
            switch (s.charAt(i)) {
                case '(':
                    stacks.push('(');
                    break;
                case '{':
                    stacks.push('{');
                    break;
                case '[':
                    stacks.push('[');
                    break;
                case ')':
                    if (stacks.isEmpty() || stacks.peek() != '(')
                        return false;
                    else
                        stacks.pop();
                    break;
                case '}':
                    if (stacks.isEmpty() || stacks.peek() != '{')
                        return false;
                    else
                        stacks.pop();
                    break;
                case ']':
                    if (stacks.isEmpty() || stacks.peek() != '[')
                        return false;
                    else
                        stacks.pop();
                    break;
            }
        }
        if (!stacks.isEmpty())
            return false;
        return true;
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Problem22_GenerateParentheses {
    List<String> l = new ArrayList();

    public List<String> generateParenthesis(int n) {

        addParenthesis("", 2 * n);
        return l;
    }

    public void addParenthesis(String p, int n) {
        if (n == 0) {
            if (isValid(p))
                l.add(p);
            return;
        }
        addParenthesis(p + "(", n - 1);
        addParenthesis(p + ")", n - 1);

    }

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

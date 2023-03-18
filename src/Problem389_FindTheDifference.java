import java.util.HashMap;
import java.util.Map;

public class Problem389_FindTheDifference {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> unique = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            int count = 1;
            if (unique.containsKey(c)) {
                count += unique.get(c);
            }
            unique.put(c, count);
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (unique.containsKey(c)) {
                int count = unique.get(c) - 1;
                if (count == 0) {
                    unique.remove(c);
                } else {
                    unique.put(c, count);
                }
            }
        }
        return unique.keySet().iterator().next();
    }
}

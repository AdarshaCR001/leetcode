import java.util.HashMap;
import java.util.Map;

public class Problem242_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int n;
            if (map.containsKey(c)) {
                n = map.get(c) + 1;
            } else {
                n = 1;
            }
            map.put(c, n);
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (map.containsKey(c)) {
                int n = map.get(c) - 1;
                if (n == 0) {
                    map.remove(c);
                } else {
                    map.put(c, n);
                }
            } else {
                return false;
            }
        }
        if (map.size() > 0) {
            return false;
        }
        return true;
    }
}

import java.util.HashMap;
import java.util.Map;

public class Problem205_IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> smap = new HashMap<>();
        Map<Character, Character> tmap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (smap.containsKey(c1)) {
                if (c2 != smap.get(c1)) {
                    return false;
                }
            } else {
                smap.put(c1, c2);
            }
            if (tmap.containsKey(c2)) {
                if (c1 != tmap.get(c2)) {
                    return false;
                }
            } else {
                tmap.put(c2, c1);
            }
        }
        return true;
    }
}

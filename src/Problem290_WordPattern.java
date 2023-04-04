import java.util.*;

public class Problem290_WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        Set<String> wwords = new HashSet<>(Arrays.asList(words));
        for (int i = 0; i < pattern.length(); i++) {
            if (!map.containsKey(pattern.charAt(i))) {
                map.put(pattern.charAt(i), words[i]);
            } else {
                if (!map.get(pattern.charAt(i)).equals(words[i])) {
                    return false;
                }
            }
            if (wwords.size() < map.size()) {
                return false;
            }
        }
        return true;
    }
}

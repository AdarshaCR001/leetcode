import java.util.*;

public class Problem49_GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagram = new HashMap<>();
        for (String s : strs) {
            char[] letters = s.toCharArray();
            Arrays.sort(letters);
            List<String> same;
            String key = new String(letters);
            if (anagram.containsKey(key)) {
                same = anagram.get(key);
            } else {
                same = new ArrayList<>();
            }
            same.add(s);
            anagram.put(key, same);
        }
        return new ArrayList(anagram.values());
    }
}

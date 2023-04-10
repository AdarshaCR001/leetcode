import java.util.*;

public class Problem500_KeyboardRow {
    private static Set<Character> first = new HashSet<>(Arrays.asList('Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P'));
    private static Set<Character> second = new HashSet<>(Arrays.asList('A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L'));
    private static Set<Character> third = new HashSet<>(Arrays.asList('Z', 'X', 'C', 'V', 'B', 'N', 'M'));

    public String[] findWords(String[] words) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            String word1 = word.toUpperCase();
            boolean isPossible = true;
            char c = word1.charAt(0);
            Set<Character> set;
            if (first.contains(c)) {
                set = first;
            } else if (second.contains(c)) {
                set = second;
            } else {
                set = third;
            }
            for (int i = 1; i < word1.length(); i++) {
                c = word1.charAt(i);
                if (!set.contains(c)) {
                    isPossible = false;
                    break;
                }
            }
            if (isPossible) {
                result.add(word);
            }
        }
        return result.toArray(new String[result.size()]);
    }
}

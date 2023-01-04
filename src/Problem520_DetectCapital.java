public class Problem520_DetectCapital {
    public boolean detectCapitalUse(String word) {
        boolean upper = true;
        boolean lower = true;
        boolean firstOnly = true;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (upper && (c < 'A' || c > 'Z')) {
                upper = false;
            }
            if (lower && (c < 'a' || c > 'z')) {
                lower = false;
            }
            if (firstOnly && i != 0 && (c < 'a' || c > 'z')) {
                firstOnly = false;
            }
            if (!(upper || lower || firstOnly)) {
                return false;
            }
        }
        return upper || lower || firstOnly;
    }
}

public class Problem409_LongestPalindrome {
    public int longestPalindrome(String s) {
        char[] alphabet = new char[52];
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                alphabet[c - 'a']++;
            } else {
                alphabet[c - 'A' + 26]++;
            }
        }
        int result = 0;
        boolean oddPresent = false;
        for (int val : alphabet) {
            result += val / 2;
            if (val % 2 != 0) {
                oddPresent = true;
            }
        }
        result *= 2;
        if (oddPresent) {
            result++;
        }
        return result;
    }
}

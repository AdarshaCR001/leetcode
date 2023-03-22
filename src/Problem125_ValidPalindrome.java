public class Problem125_ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                res.append(c);
            }
        }
        String s1 = res.toString();
        String s2 = res.reverse().toString();
        return s1.equals(s2);
    }
}

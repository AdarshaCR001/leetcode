public class Problem3_LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        String res = "";
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (res.contains(Character.toString(s.charAt(i)))) {
                if (res.indexOf(s.charAt(i)) + 1 <= res.length())
                    res = res.substring(res.indexOf(s.charAt(i)) + 1, res.length());
                else
                    res = "";
            }
            res += Character.toString(s.charAt(i));

            if (res.length() > max) {
                max = res.length();
            }
        }

        return max;

    }
}

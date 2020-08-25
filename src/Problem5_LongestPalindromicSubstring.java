public class Problem5_LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String palindrome = "";
        if (s.length() > 0)
            palindrome = Character.toString(s.charAt(0));

        if (s.length() == 2 && s.charAt(0) == s.charAt(1)) {
            palindrome = s;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            int oddOne = 0, evenOne = 0;
            int o = 1, e = 1;

            for (int j = 0; i - j >= 0 && i + j < s.length(); j++) {
                try {

                    if (o == 1 && s.charAt(i - j) == s.charAt(i + j)) {
                        oddOne++;
                    } else {
                        o = 0;
                    }


                    if (e == 1 && s.charAt(i - j) == s.charAt(i + j + 1)) {
                        evenOne++;
                    } else {
                        e = 0;
                    }

                    if (e == 0 && o == 0)
                        break;
                } catch (Exception ex) {
                    break;
                }
            }
            if (palindrome.length() < (2 * oddOne - 1) || palindrome.length() < (2 * evenOne)) {
                if (oddOne > evenOne)
                    palindrome = s.substring(i - (oddOne - 1), i + oddOne);
                else
                    palindrome = s.substring(i - (evenOne - 1), i + evenOne + 1);
            }
        }

        return palindrome;
    }
}

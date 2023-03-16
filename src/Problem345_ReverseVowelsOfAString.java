public class Problem345_ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        int low = 0;
        int high = s.length() - 1;
        StringBuilder reverseVowelString = new StringBuilder(s);
        while (low < high) {
            char f = reverseVowelString.charAt(low);
            char e = reverseVowelString.charAt(high);
            if (isVowel(f) && isVowel(e)) {
                reverseVowelString.setCharAt(low, e);
                reverseVowelString.setCharAt(high, f);
                low++;
                high--;
            }
            if (!isVowel(f)) {
                low++;
            }
            if (!isVowel(e)) {
                high--;
            }
        }
        return reverseVowelString.toString();
    }

    private boolean isVowel(char c) {
        switch (c) {
            case 'a':
                return true;
            case 'e':
                return true;
            case 'i':
                return true;
            case 'o':
                return true;
            case 'u':
                return true;
            case 'A':
                return true;
            case 'E':
                return true;
            case 'I':
                return true;
            case 'O':
                return true;
            case 'U':
                return true;
            default:
                return false;
        }
    }
}

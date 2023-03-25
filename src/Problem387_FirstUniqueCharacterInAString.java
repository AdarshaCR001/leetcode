public class Problem387_FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        char[] array = new char[26];
        for (char i : s.toCharArray()) {
            array[i - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (array[c - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}

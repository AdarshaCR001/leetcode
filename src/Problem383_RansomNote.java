public class Problem383_RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        char[] magazineCharArray = new char[26];
        for (char i : magazine.toCharArray()) {
            magazineCharArray[i - 'a']++;
        }
        for (char i : ransomNote.toCharArray()) {
            if (magazineCharArray[i - 'a'] == 0) {
                return false;
            }
            magazineCharArray[i - 'a']--;
        }
        return true;
    }
}

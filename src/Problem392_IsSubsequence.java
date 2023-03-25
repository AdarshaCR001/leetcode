public class Problem392_IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int m = s.length(), n = t.length();
        if (m == 0) {
            return true;
        }
        int i = 0, j = 0;
        char ss[] = s.toCharArray();
        char tt[] = t.toCharArray();
        while (j < n) {
            if (ss[i] == tt[j]) {
                i++;
            }
            j++;
            if (i == m) {
                return true;
            }
        }
        return false;
    }
}

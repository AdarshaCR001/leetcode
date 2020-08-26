public class Problem14_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length < 1)
            return "";
        int i = 0;
        for (i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            int j = 0;
            for (j = 0; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    break;
                }
            }
            if (j != strs.length) {
                break;
            }
        }
        return strs[0].substring(0, i);
    }
}

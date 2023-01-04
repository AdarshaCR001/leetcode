public class Problem944_DeleteColumnsToMakeSorted {
    public int minDeletionSize(String[] strs) {
        int count = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            char low = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                char c = strs[j].charAt(i);
                if (low > c) {
                    count++;
                    break;
                }
                low = c;
            }
        }
        return count;
    }
}

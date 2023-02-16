public class Problem443_StringCompression {
    public int compress(char[] chars) {
        Character pre = null;
        int j = 0;
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            Character c = chars[i];
            if (pre != c) {
                if (pre != null) {
                    chars[j++] = pre;
                    if (count > 1) {
                        String s = count + "";
                        for (int k = 0; k < s.length(); k++) {
                            chars[j++] = (char) (s.charAt(k));
                        }
                        count = count / 10;
                    }
                }
                pre = c;
                count = 1;
            } else {
                count++;
            }
        }
        chars[j++] = pre;
        if (count > 1) {
            String s = count + "";
            for (int k = 0; k < s.length(); k++) {
                chars[j++] = (char) (s.charAt(k));
            }
            count = count / 10;
        }
        return j;
    }
}

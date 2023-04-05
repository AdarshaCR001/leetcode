public class Problem434_NumberOfSegmentsInAString {
    public int countSegments(String s) {
        int count = 0;
        char prev = ' ';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ' && prev != ' ') {
                count++;
            }
            prev = c;
        }
        if (prev != ' ') {
            count++;
        }
        return count;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Problem38_CountAndSay {
    static List<String> list = new ArrayList<>();

    public String countAndSay(int n) {
        if (list.size() == 0) {
            list.add("1");
        }
        sum = list.get(list.size() - 1);
        countAndGet(n);
        return list.get(n - 1);
    }

    String sum = "1";

    public void countAndGet(int n) {
        if (list.size() >= n) {
            return;
        }
        char prev = 'A';
        int count = 0;
        String temp = "";
        for (int i = 0; i < sum.length(); i++) {
            if (prev == 'A') {
                prev = sum.charAt(i);
            }
            if (sum.charAt(i) == prev) {
                count++;
            } else {
                temp += "" + count + prev;

                prev = sum.charAt(i);
                count = 1;
            }
        }
        sum = temp + count + prev;
        list.add(sum);
        countAndGet(n);
    }
}

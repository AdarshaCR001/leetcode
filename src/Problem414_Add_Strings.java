import java.util.ArrayList;
import java.util.List;

public class Problem414_Add_Strings {
    public String addStrings(String num1, String num2) {
        if (num1.length() > num2.length()) {
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }
        List<String> strings = new ArrayList<>();
        strings.add(num1);
        strings.add(num2);
        return addition(strings);
    }

    private String addition(List<String> sums) {
        String largeSum = null;
        for (int i = 0; i < sums.size(); i++) {
            String a = sums.get(i);
            if (largeSum == null) {
                largeSum = a;
            } else {
                int carry = 0;
                StringBuffer sum = new StringBuffer();
                //If the new number is bigger then remaing needs to be added later;
                int p = (a.length() - 1) - (largeSum.length() - 1);
                //Each digit from same position needs to be added
                for (int j = largeSum.length() - 1; j >= 0; j--) {
                    int m = Character.getNumericValue(largeSum.charAt(j));
                    int n = Character.getNumericValue(a.charAt(j + p));
                    int add = m + n + carry;
                    carry = add / 10;
                    add = add % 10;
                    sum.append(add);
                }
                while (p > 0) {
                    int m = Character.getNumericValue(a.charAt(p - 1));
                    int add = m + carry;
                    carry = add / 10;
                    add = add % 10;
                    sum.append(add);
                    p--;
                }
                if (carry != 0) {
                    sum.append(carry);
                }
                largeSum = sum.reverse().toString();
            }
        }
        return largeSum;
    }
}

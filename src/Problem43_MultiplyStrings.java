import java.util.ArrayList;
import java.util.List;

public class Problem43_MultiplyStrings {
    public String multiply(String num1, String num2) {
        //If number contains only 0, then return "0"
        if (num1.matches("0+") || num2.matches("0+")) {
            return "0";
        }
        //To reduce the number of addition, take largest number length as primary
        if (num1.length() > num2.length()) {
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }
        List<String> sums = new ArrayList<>();
        //Multiply each digit from num1 with num2 and store that as list in sums
        StringBuffer zero = new StringBuffer();
        for (int i = num1.length() - 1; i >= 0; i--) {
            int carry = 0;
            int m = Character.getNumericValue(num1.charAt(i));
            StringBuffer sum = new StringBuffer();
            for (int j = num2.length() - 1; j >= 0; j--) {
                int n = Character.getNumericValue(num2.charAt(j));
                int prod = (m * n) + carry;
                carry = prod / 10;
                prod = prod % 10;
                sum.append(prod);
            }
            if (carry != 0) {
                sum.append(carry);
            }
            //As all the digits are multiplied in reverse order, reversing will give right value
            sum.reverse();
            sum.append(zero);
            sums.add(sum.toString());
            zero.append("0");
        }
        //Now the list looks will look for example 123*12
        // 456,1230
        //Now we have all the product value of num2 if its is multiplied with
        return addition(sums);
    }

    //This method will add all the string in the list
    private String addition(List<String> sums) {
        System.out.println(sums);
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

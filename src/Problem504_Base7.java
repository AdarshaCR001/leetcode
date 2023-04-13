public class Problem504_Base7 {
    public String convertToBase7(int num) {
        StringBuilder s = new StringBuilder();
        boolean negative = false;
        if (num < 0) {
            num *= -1;
            negative = true;
        }
        while (num > 0) {
            int rem = num % 7;
            s.append(rem);
            num = num / 7;
        }
        if (s.isEmpty()) {
            s.append(0);
        }
        if (negative) {
            s.append("-");
        }
        return s.reverse().toString();
    }
}

public class Problem8_StringtoInteger_atoi {
    public int myAtoi(String str) {
        int res = 0;
        try {
            str = str.trim();

            if ((str.charAt(0) != '+' && str.charAt(0) != '-' && !Character.isDigit(str.charAt(0)))) {
                return 0;
            } else if (!Character.isDigit(str.charAt(0)) && !Character.isDigit(str.charAt(1))) {
                return 0;
            }
            boolean isNegative = false;
            if (str.charAt(0) == '-') {
                isNegative = true;
                str = str.replace("-", "");
            } else if (str.charAt(0) == '+') {
                str = str.replace("+", "");
            }
            int last = 0;
            int count = 0;
            for (int i = 0; i < str.length(); i++) {

                if (Character.isDigit(str.charAt(i))) {
                    if (count > 0)
                        count++;
                    if (Character.getNumericValue(str.charAt(0)) > 0 && count == 0)
                        count++;

                    if (count >= 11) {
                        if (isNegative)
                            return -2147483648;
                        else
                            return 2147483647;
                    }
                    last = Character.getNumericValue(str.charAt(i));
                    res = res * 10 + Character.getNumericValue(str.charAt(i));
                } else {
                    break;
                }
            }

            if (res % 10 != last) {
                if (isNegative)
                    return -2147483648;
                else
                    return 2147483647;
            }

            if (isNegative)
                return res * -1;

        } catch (Exception e) {
            res = 0;
        }
        return res;
    }
}

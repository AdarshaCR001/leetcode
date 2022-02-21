public class Problem66_PlusOne {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int num = digits[i] + carry;
            carry = num / 10;
            if (carry == 0) {
                digits[i] = num;
                break;
            }
            digits[i] = num % 10;

        }
        if (carry != 0) {
            int[] result = new int[digits.length + 1];
            for (int i = digits.length - 1; i >= 0; i--) {
                result[i + 1] = digits[i];
            }
            result[0] = carry;
            return result;
        }
        return digits;
    }
}

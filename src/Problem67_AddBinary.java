public class Problem67_AddBinary {
    public String addBinary(String a, String b) {
        int carry = 0;
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1;
        while (i >= 0 && j >= 0) {
            int sum = Character.getNumericValue(a.charAt(i))
                    + Character.getNumericValue(b.charAt(j)) + carry;
            int[] resultCarry = binarysum(sum);
            result.append(resultCarry[0]);
            carry = resultCarry[1];
            i--;
            j--;
        }

        if (i >= 0) {
            while (i >= 0) {
                int sum = Character.getNumericValue(a.charAt(i)) + carry;
                int[] resultCarry = binarysum(sum);
                result.append(resultCarry[0]);
                carry = resultCarry[1];
                i--;
            }
        } else if (j >= 0) {
            while (j >= 0) {
                int sum = Character.getNumericValue(b.charAt(j)) + carry;
                int[] resultCarry = binarysum(sum);
                result.append(resultCarry[0]);
                carry = resultCarry[1];
                j--;
            }
        }

        if (carry == 1) {
            result.append(1);
        }
        return result.reverse().toString();
    }

    int[] binarysum(int sum) {
        int resultCarry[] = new int[2];
        if (sum == 3) {
            resultCarry[0] = 1;
            resultCarry[1] = 1;
        } else if (sum == 2) {
            resultCarry[0] = 0;
            resultCarry[1] = 1;
        } else {
            resultCarry[0] = sum;
            resultCarry[1] = 0;
        }
        return resultCarry;
    }
}

public class Problem6_ZigZagConversion {
    public String convert(String s, int numRows) {
        String[] rows = new String[numRows];

        for (int i = 0; i < numRows; i++) {
            rows[i] = "";
        }

        int j = 0;
        boolean downward = true;
        for (int i = 0; i < s.length(); i++) {
            System.out.println(i + " " + j);
            rows[j] = rows[j] + s.charAt(i);

            if (numRows > 1) {
                if (downward) {
                    if (j == numRows - 1) {
                        downward = false;
                        j--;
                    } else {
                        j++;
                    }
                } else {
                    if (j == 0) {
                        downward = true;
                        j++;
                    } else {
                        j--;
                    }
                }
            }

        }

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            res.append(rows[i]);
        }

        return res.toString();

    }
}

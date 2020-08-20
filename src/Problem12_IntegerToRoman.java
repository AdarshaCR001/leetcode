public class Problem12_IntegerToRoman {
    public String intToRoman(int num) {
        StringBuilder s = new StringBuilder();
        int i = 1;
        while (num != 0) {
            String one = "";
            String five = "";
            String ten = "";
            switch (i) {
                case 1:
                    one = "I";
                    five = "V";
                    ten = "X";
                    break;
                case 10:
                    one = "X";
                    five = "L";
                    ten = "C";
                    break;
                case 100:
                    one = "C";
                    five = "D";
                    ten = "M";
                    break;
                case 1000:
                    one = "M";
                    break;

            }
            int r = num % 10;
            num = num / 10;
            switch (r) {
                case 1:
                    s.insert(0, one);
                    break;
                case 2:
                    s.insert(0, one + one);
                    break;
                case 3:
                    s.insert(0, one + one + one);
                    break;
                case 4:
                    s.insert(0, one + five);
                    break;
                case 5:
                    s.insert(0, five);
                    break;
                case 6:
                    s.insert(0, five + one);
                    break;
                case 7:
                    s.insert(0, five + one + one);
                    break;
                case 8:
                    s.insert(0, five + one + one + one);
                    break;
                case 9:
                    s.insert(0, one + ten);
                    break;
            }
            i *= 10;
        }
        return s.toString();
    }
}

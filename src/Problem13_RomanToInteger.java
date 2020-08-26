public class Problem13_RomanToInteger {
    public int romanToInt(String s) {
        int num = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            switch (s.charAt(i)) {
                case 'I':
                    if (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')
                        num = num - 1;
                    else
                        num = num + 1;
                    break;
                case 'V':
                    num = num + 5;
                    break;
                case 'X':
                    if (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')
                        num = num - 10;
                    else
                        num = num + 10;
                    break;
                case 'L':
                    num = num + 50;
                    break;
                case 'C':
                    if (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')
                        num = num - 100;
                    else
                        num = num + 100;
                    break;
                case 'D':
                    num = num + 500;
                    break;
                case 'M':
                    num = num + 1000;
                    break;
            }
        }

        switch (s.charAt(s.length() - 1)) {
            case 'I':
                num = num + 1;
                break;
            case 'V':
                num = num + 5;
                break;
            case 'X':
                num = num + 10;
                break;
            case 'L':
                num = num + 50;
                break;
            case 'C':
                num = num + 100;
                break;
            case 'D':
                num = num + 500;
                break;
            case 'M':
                num = num + 1000;
                break;
        }
        return num;
    }
}

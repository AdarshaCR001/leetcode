public class Problem202_HappyNumber {
    public boolean isHappy(int n) {
        int max = 6;
        while (n != 1 && max > 0) {
            int sum = 0;
            while (n != 0) {
                int reminder = n % 10;
                n = n / 10;
                sum += (reminder * reminder);
            }
            n = sum;
            max--;
        }
        if (n == 1) {
            return true;
        } else {
            return false;
        }
    }
}

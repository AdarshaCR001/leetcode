public class Problem7_ReverseInteger {
    public int Reverse(int x) {
        int sum = 0;
        int first = 0;
        while (x != 0) {
            first = x % 10;
            sum = sum * 10 + first;
            x = x / 10;
        }
        if (first != sum % 10) {
            return 0;
        }
        return sum;
    }
}

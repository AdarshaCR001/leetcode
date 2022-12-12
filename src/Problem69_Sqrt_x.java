public class Problem69_Sqrt_x {
    public int mySqrt(int x) {
        int sqrt = 0;
        for (int i = 1; i <= Integer.MAX_VALUE; i++) {
            int power = i * i;
            if (power == x) {
                sqrt = i;
                break;
            } else if (power > x || power < 0) {
                sqrt = i - 1;
                break;
            }
        }
        return sqrt;
    }
}

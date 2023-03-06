public class Problem50_Pow_x_n {
    public double myPow(double x, int n) {
        long pow = n;
        if (n < 0) {
            pow *= -1;
        }
        double result = 1;
        while (pow > 0) {
            if (pow % 2 == 1) {
                result = result * x;
                pow--;
            } else {
                x = x * x;
                pow = pow / 2;
            }
        }
        if (n < 0) {
            result = 1 / result;
        }
        return result;
    }
}

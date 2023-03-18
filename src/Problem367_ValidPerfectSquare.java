public class Problem367_ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        long low = 1;
        long high = (num / 2) + 1;
        while (low <= high) {
            long mid = (low + high) / 2;
            long prod = mid * mid;
            if (prod == num) {
                return true;
            }
            if (prod < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}

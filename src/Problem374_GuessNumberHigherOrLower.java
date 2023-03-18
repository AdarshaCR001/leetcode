public class Problem374_GuessNumberHigherOrLower {
    public int guessNumber(int n) {
        long low = 1;
        long high = n;
        while (low <= high) {
            long mid = (low + high) / 2;
            int prod = guess((int) mid);
            if (prod == 0) {
                return (int) mid;
            }
            if (prod == 1) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return n;
    }
}

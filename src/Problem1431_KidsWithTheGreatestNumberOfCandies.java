import java.util.ArrayList;
import java.util.List;

public class Problem1431_KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> result = new ArrayList<Boolean>();

        for (int kid : candies) {
            if (kid > max) {
                max = kid;
            }
        }
        for (int kid : candies) {
            if (kid + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;

    }
}

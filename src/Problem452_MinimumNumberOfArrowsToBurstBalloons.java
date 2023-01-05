import java.util.Arrays;

public class Problem452_MinimumNumberOfArrowsToBurstBalloons {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int arrowCount = 1;
        int previous = 0;
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > points[previous][1]) {
                arrowCount++;
                previous = i;
            }
        }
        return arrowCount;
    }
}

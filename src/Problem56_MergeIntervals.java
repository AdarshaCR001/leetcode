import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Problem56_MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        List<int[]> array = new ArrayList<>();
        int[] temp = new int[2];
        temp[0] = intervals[0][0];
        temp[1] = intervals[0][1];
        array.add(temp);
        int l = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= array.get(l)[1]) {
                if (array.get(l)[1] < intervals[i][1]) {
                    array.get(l)[1] = intervals[i][1];
                }
            } else {
                int[] a = new int[2];
                a[0] = intervals[i][0];
                a[1] = intervals[i][1];
                array.add(a);
                l++;
            }

        }
        int[][] result = new int[array.size()][2];
        for (int i = 0; i < result.length; i++) {
            result[i][0] = array.get(i)[0];
            result[i][1] = array.get(i)[1];
        }
        return result;
    }
}

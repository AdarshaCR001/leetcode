import java.util.ArrayList;
import java.util.List;

public class Problem57_InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> array = new ArrayList<>();
        boolean newIntervalAdded = false;
        for (int i = 0; i < intervals.length; i++) {
            if (!newIntervalAdded) {
                if (intervals[i][1] < newInterval[0]) {
                    array.add(intervals[i]);
                } else {
                    boolean noInterval = true;
                    if (intervals[i][0] <= newInterval[0]
                            && newInterval[0] <= intervals[i][1]) {
                        newInterval[0] = intervals[i][0];
                        noInterval = false;
                    }
                    if (intervals[i][0] <= newInterval[1]
                            && newInterval[1] <= intervals[i][1]) {
                        newInterval[1] = intervals[i][1];
                        noInterval = false;
                    }
                    if (newInterval[0] <= intervals[i][0]
                            && intervals[i][0] <= newInterval[1]) {
                        noInterval = false;
                    }
                    if (newInterval[0] <= intervals[i][1]
                            && intervals[i][1] <= newInterval[1]) {
                        noInterval = false;
                    }
                    array.add(newInterval);
                    if (noInterval) {
                        array.add(intervals[i]);
                    }
                    newIntervalAdded = true;
                }
            } else {
                int lastIndex = array.size() - 1;
                if (intervals[i][0] <= array.get(lastIndex)[1]) {
                    if (array.get(lastIndex)[1] < intervals[i][1]) {
                        array.get(lastIndex)[1] = intervals[i][1];
                    }
                } else {
                    array.add(intervals[i]);
                }
            }
        }
        if (!newIntervalAdded) {
            array.add(newInterval);
        }
        return array.toArray(new int[array.size()][]);
    }
}

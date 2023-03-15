import java.util.ArrayList;
import java.util.List;

public class Problem228_SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length > 0) {
            int start = 0;
            int end = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[end] + 1 != nums[i]) {
                    StringBuilder path = new StringBuilder();
                    path.append(nums[start]);
                    if (start != end) {
                        path.append("->" + nums[end]);
                    }
                    result.add(path.toString());
                    start = i;
                    end = i;
                } else {
                    end = i;
                }
            }
            StringBuilder path = new StringBuilder();
            path.append(nums[start]);
            if (start != end) {
                path.append("->" + nums[end]);
            }
            result.add(path.toString());
        }
        return result;
    }
}

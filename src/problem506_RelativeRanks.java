import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class problem506_RelativeRanks {
    public String[] findRelativeRanks(int[] score) {
        int[] score_temp = Arrays.stream(score).boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < score_temp.length; i++) {
            if (i == 0) {
                map.put(score_temp[i], "Gold Medal");
            } else if (i == 1) {
                map.put(score_temp[i], "Silver Medal");
            } else if (i == 2) {
                map.put(score_temp[i], "Bronze Medal");
            } else {
                map.put(score_temp[i], String.valueOf(i + 1));
            }
        }
        String[] result = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            result[i] = map.get(score[i]);
        }
        return result;
    }
}

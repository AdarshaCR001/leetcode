import java.util.ArrayList;
import java.util.List;

public class Problem448_FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int length = nums.length;
        boolean[] array = new boolean[length + 1];
        for (int i : nums) {
            array[i] = true;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= length; i++) {
            if (!array[i]) {
                result.add(i);
            }
        }
        return result;
    }
}

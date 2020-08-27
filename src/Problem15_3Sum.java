import java.util.*;

public class Problem15_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<Integer> Nums = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            Nums.add(nums[i]);
        }
        //Nums.addAll(nums);
        Collections.sort(Nums);

        Set<List<Integer>> sets = new HashSet();
        List<List<Integer>> lists = new ArrayList();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                int low = j + 1;
                int high = nums.length - 1;

                int rem = (Nums.get(i) + Nums.get(j)) * (-1);

                while (low <= high) {
                    int mid = (low + high) / 2;

                    if (Nums.get(mid) > rem) {
                        high = mid - 1;
                    } else if (Nums.get(mid) < rem) {
                        low = mid + 1;
                    } else {
                        List<Integer> l = new ArrayList();
                        l.add(Nums.get(i));
                        l.add(Nums.get(j));
                        l.add(Nums.get(mid));
                        if (!sets.contains(l)) {
                            sets.add(l);
                            lists.add(l);
                        }
                        break;
                    }
                }
            }
        }
        return lists;
    }
}

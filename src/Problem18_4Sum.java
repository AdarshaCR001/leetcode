import java.util.*;

public class Problem18_4Sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<Integer> Nums = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            Nums.add(nums[i]);
        }
        //Nums.addAll(nums);
        Collections.sort(Nums);

        Set<List<Integer>> sets = new HashSet();
        List<List<Integer>> lists = new ArrayList();
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                for (int k = j + 1; k < nums.length - 1; k++) {
                    int low = k + 1;
                    int high = nums.length - 1;

                    int rem = target - (Nums.get(i) + Nums.get(j) + Nums.get(k));

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
                            l.add(Nums.get(k));
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
        }
        return lists;
    }
}

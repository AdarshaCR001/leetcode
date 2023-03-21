import helper.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Problem113_PathSum2 {
    List<List<Integer>> result = new ArrayList<>();
    long targetSum;

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        this.targetSum = targetSum;
        hasPathSumUtil(root, 0, new ArrayList<>());
        return result;
    }

    private void hasPathSumUtil(TreeNode root, long currentSum, List<Integer> array) {
        if (root == null) {
            return;
        }
        currentSum += root.val;
        array.add(root.val);
        if (currentSum == targetSum && root.left == null && root.right == null) {
            result.add(new ArrayList<>(array));
            return;
        }
        if (root.left != null) {
            hasPathSumUtil(root.left, currentSum, array);
            array.remove(array.size() - 1);
        }
        if (root.right != null) {
            hasPathSumUtil(root.right, currentSum, array);
            array.remove(array.size() - 1);
        }
    }
}

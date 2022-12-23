import helper.TreeNode;

public class Problem100_SameTree {
    boolean same = true;

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (same) {
            if (p != null && q != null) {
                if (p.val == q.val) {
                    same = isSameTree(p.left, q.left);
                    same = isSameTree(p.right, q.right);
                } else {
                    return false;
                }
            } else if (p == null && q == null) {
                return true;
            } else {
                return false;
            }
        }
        return same;
    }
}

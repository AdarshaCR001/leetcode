import helper.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Problem144_BinaryTreePreorderTraversal {
    List<Integer> preOrder=new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null){
            return preOrder;
        }
        preOrder.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return preOrder;
    }
}

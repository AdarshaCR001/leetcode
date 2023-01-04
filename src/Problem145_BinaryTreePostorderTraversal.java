import helper.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Problem145_BinaryTreePostorderTraversal {
    List<Integer> postOrder=new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null){
            return postOrder;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        postOrder.add(root.val);
        return postOrder;
    }
}

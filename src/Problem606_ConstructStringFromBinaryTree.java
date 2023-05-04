import helper.TreeNode;

public class Problem606_ConstructStringFromBinaryTree {
    StringBuilder s=new StringBuilder();
    public String tree2str(TreeNode root) {
        if(root!=null){
            traverse(root);
        }
        return s.toString();
    }

    private void traverse(TreeNode root){
        s.append(root.val);
        if(root.left!=null){
            s.append("(");
            traverse(root.left);
            s.append(")");
        }
        if(root.left==null&&root.right!=null){
            s.append("()(");
            traverse(root.right);
            s.append(")");
        }else if(root.right!=null){
            s.append("(");
            traverse(root.right);
            s.append(")");
        }
    }
}

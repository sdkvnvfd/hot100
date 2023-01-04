
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 二叉树的中序遍历94 {
}
class Solution94 {
    List<Integer> res=new ArrayList<>();
    Stack<TreeNode> stack= new Stack<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        while(stack.size()>0||root!=null){
            if(root!=null){
                stack.push(root);
                root=root.left;
            }else{
                TreeNode temp=stack.pop();
                res.add(temp.val);
                root=temp.right;
            }
        }
        return res;
    }
}
 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

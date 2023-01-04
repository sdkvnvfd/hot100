public class 验证二叉搜索树98 {
}
class Solution98 {
    Integer pre;
    public boolean isValidBST(TreeNode root) {

        if(root==null)
            return true;
        boolean left=isValidBST(root.left);
        if(pre!=null&&pre>=root.val)
            return false;
        pre=root.val;
        boolean right=isValidBST(root.right);
        return left&&right;
    }
}

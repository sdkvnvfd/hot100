public class 翻转二叉树226 {
}
class Solution226 {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
            return root;
        TreeNode temp;
        temp=root.left;
        root.left=root.right;
        root.right=temp;
        if(root.left!=null)
            invertTree(root.left);
        if(root.right!=null)
            invertTree(root.right);
        return root;
    }
}

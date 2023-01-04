public class 二叉树展开为链表114 {
}
class Solution114 {
    public void flatten(TreeNode root) {
        while(root!=null){
            if(root.left==null)
                root=root.right;
            else{
                //找到左子树的最右结点
                TreeNode pre=root.left;
                while(pre.right!=null){
                    pre=pre.right;
                }
//                将根节点的右子树移到左子树的最右结点上
                pre.right=root.right;
                //再将左子树移到右子树
                root.right=root.left;
                root.left=null;
                //考虑下一个节点
                root=root.right;
            }
        }
    }
}

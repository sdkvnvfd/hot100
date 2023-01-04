

import java.util.HashMap;
import java.util.HashSet;

public class 前中序构造二叉树105 {
}
class Solution105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return buildTreeHelper(preorder,0,preorder.length,inorder,0,inorder.length,map);

    }
    public TreeNode buildTreeHelper(int[] preorder, int p_start, int p_end, int[] inorder, int i_start, int i_end, HashMap<Integer,Integer> map){
        if(p_start==p_end){
            return null;
        }
        int value=preorder[p_start];
        TreeNode root=new TreeNode(value);
        int i=map.get(value);
        int left_num=i-i_start;
        root.left=buildTreeHelper(preorder,p_start+1,p_start+1+left_num,inorder,i_start,i,map);
        root.right=buildTreeHelper(preorder,p_start+1+left_num,p_end,inorder,i+1     ,i_end,map);
        return root;
    }
}

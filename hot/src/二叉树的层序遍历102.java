import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class 二叉树的层序遍历102 {
}
class Solution102 {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> que=new ArrayDeque<>();
        if(root!=null)
            que.add(root);
        while(que.size()>0){
            int n=que.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode node=que.poll();
                list.add(node.val);
                if(node.left!=null)
                    que.add(node.left);
                if(node.right!=null)
                    que.add(node.right);
            }
            res.add(list);


        }
        return res;
    }
}

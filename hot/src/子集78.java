import java.util.ArrayList;
import java.util.List;

public class 子集78 {
    public static void main(String[] args) {
        Solution78 s78= new Solution78();
        int[] nums={1,2,3};
        System.out.println(s78.subsets(nums));
    }
}
class Solution78 {
    List<Integer> path=new ArrayList<>();
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        int index=0;
        backtracking(nums,index);
        return res;
    }
    public void backtracking(int[] nums,int index){
        res.add(new ArrayList<>(path));
        if(index>=nums.length)
            return;
        for(int i=index;i<nums.length;i++){
            path.add(nums[i]);
            backtracking(nums,i+1);
            path.remove(path.size()-1);
        }
    }
}

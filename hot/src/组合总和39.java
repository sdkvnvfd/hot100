import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 组合总和39 {
    public static void main(String[] args) {
        Solution39 s39=new Solution39();
        int[] nums={2,3,6,7};
        int target=7;
        System.out.println(s39.combinationSum(nums,target));
    }
}
class Solution39 {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> list=new ArrayList<>();
    int sum=0;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtracking(candidates,target,0);
        return res;
    }
    public void backtracking(int[] candidates,int target,int index){
        if(sum==target){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<=candidates.length-1;i++){
            if(sum+candidates[i]>target)
                break;
            list.add(candidates[i]);
            sum+=candidates[i];
            backtracking(candidates,target,i);
            sum-=candidates[i];
            list.remove(list.size()-1);
        }
    }
}

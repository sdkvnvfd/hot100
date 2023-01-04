import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 最长连续序列128 {
    public static void main(String[] args) {
        Solution128 s128=new Solution128();
        int[] nums={};
        System.out.println(s128.longestConsecutive(nums));
    }
}
class Solution128 {
    public int longestConsecutive(int[] nums) {
        int max=0;
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for(int num:set){
            int cur=num;
            if(!set.contains(num-1)){
                while(set.contains(cur+1))
                    cur++;
            }
            max=Math.max(max,cur-num+1);
        }
        return max;
    }
}

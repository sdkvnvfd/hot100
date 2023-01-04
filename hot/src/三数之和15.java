import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 三数之和15 {
    public static void main(String[] args) {
        Solution15 s15=new Solution15();
        int[] nums={0,1,1};
        System.out.println(s15.threeSum(nums));
    }
}
class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        int len=nums.length;
        Arrays.sort(nums);
        int left,right;
        for(int i=0;i<len-2;i++){
            if(nums[i]>0)
                return res;
            if(i>0&&nums[i]==nums[i-1])
                continue;
            left=i+1;
            right=len-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum>0)
                    right--;
                else if(sum<0){
                    left++;
                }else{
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    res.add(list);
                    while(left<right&&nums[right]==nums[right-1])
                        right--;
                    while(left<right&&nums[left]==nums[left+1])
                        left++;
                    left++;
                    right--;
                }
            }
        }
        return res;
    }
}

import java.util.*;

public class 两数之和01 {
    public static void main(String[] args) {
        Solution01 s01=new Solution01();
        int[] nums={2,7,11,15};
        int target=9;
        int[] res=s01.twoSum(nums,target);
        System.out.println(Arrays.toString(res));
    }
}
class Solution01 {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=target-nums[i];
            if(map.containsKey(num)){
               res[0]=map.get(num);
               res[1]=i;
            }else{
                map.put(nums[i],i);
            }
        }
        return res;
    }

}

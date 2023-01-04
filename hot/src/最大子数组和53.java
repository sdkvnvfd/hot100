public class 最大子数组和53 {
    public static void main(String[] args) {
        Solution53 s53=new Solution53();
        int[] nums={5,4,-1,7,8};
        System.out.println(s53.maxSubArray(nums));
    }
}
class Solution53{
    public int maxSubArray(int[] nums){
        int len=nums.length;
        int[] dp=new int[len+1];
        dp[0]=0;
        int res=Integer.MIN_VALUE;
        for(int i=1;i<len+1;i++){
            dp[i]=nums[i-1];
        }
        for(int i=2;i<len+1;i++){
            dp[i]=Math.max(dp[i],dp[i-1]+nums[i-1]);
        }
        for(int i=1;i<len+1;i++){
            res=Math.max(res,dp[i]);
        }
        return res;
    }
}

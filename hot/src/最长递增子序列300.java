public class 最长递增子序列300 {
    public static void main(String[] args) {
        Solution300 s300=new Solution300();
        int[] nums={10,9,2,5,3,7,101,18};
        System.out.println(s300.lengthOfLIS(nums));
    }
}
class Solution300 {
    public int lengthOfLIS(int[] nums) {
        int len=nums.length;
        int[] dp=new int[len];
        for(int i=0;i<len;i++){
            dp[i]=1;
        }
        for(int i=1;i<len;i++){
            for(int j=i-1;j>=0;j--){
                if(nums[j]<nums[i]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int res=0;
        for(int i=0;i<len;i++)
            res=Math.max(res,dp[i]);
        return res;
    }
}

public class 乘积最大子数组152 {
    public static void main(String[] args) {
        Solution152 s152=new Solution152();
        int[] nums={-2,0,-1};
        System.out.println(s152.maxProduct(nums));
    }
}
class Solution152 {
    public int maxProduct(int[] nums) {
        int len=nums.length;
        int[] dp=new int[len];
        for(int i=0;i<len;i++){
            dp[i]=nums[i];
        }
        for(int i=1;i<len;i++){
            int temp=dp[i];
            int max=dp[i];
            for(int j=i-1;j>=0;j--){
                max=Math.max(max,temp*nums[j]);
                temp=temp*nums[j];
            }
            dp[i]=max;
        }
        int res=dp[0];
        for(int i=1;i<len;i++){
            res=Math.max(res,dp[i]);
        }
        return res;
    }
}

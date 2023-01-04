public class 跳跃游戏55 {
    public static void main(String[] args) {
        Solution55 s55=new Solution55();
        int[] nums={1};
        System.out.println(s55.canJump(nums));
    }
}
class Solution55 {
    public boolean canJump(int[] nums) {
        int len=nums.length;
        boolean[] dp=new boolean[len];
        int num=nums[0];
        for(int i=0;i<=num&&i<len;i++){
            dp[i]=true;
        }
        for(int i=num+1;i<len;i++){
            dp[i]=false;
        }
        for(int i=num+1;i<len;i++){
            int j;
            for(j=i-1;j>=0;j--){
                if(dp[j]==true&&(nums[j]+j>=i)){
                    dp[i]=true;
                    break;
                }
            }
            if(j<0)
                dp[i]=false;
        }
        if(dp[len-1]==true)
            return true;
        else
            return false;
    }
}

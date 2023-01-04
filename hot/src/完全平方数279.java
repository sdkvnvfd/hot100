public class 完全平方数279 {
    public static void main(String[] args) {
        Solution279 s279=new Solution279();
        int n=13;
        System.out.println(s279.numSquares(n));
    }
}
class Solution279 {
    public int numSquares(int n) {
        int[] dp=new int[n+1];
        dp[0]=0;
        for(int i=1;i<n+1;i++)
            dp[i]=i;
        for(int i=2;i<n+1;i++){
            for(int j = (int) Math.sqrt(i); j>=1; j--){
                dp[i]=Math.min(dp[i],1+dp[i-j*j]);
            }
        }
        return dp[n];
    }
}

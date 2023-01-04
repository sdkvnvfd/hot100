public class 爬楼梯70 {
    public static void main(String[] args) {
        Solution70 s70=new Solution70();
        int n=45;
        System.out.println(s70.climbStairs(n));
    }
}
class Solution70 {
    public int climbStairs1(int n) {
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        return climbStairs(n-1)+climbStairs(n-2);
    }
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        if(n>=2){
            dp[2]=2;
            for(int i=3;i<n+1;i++){
                dp[i]=dp[i-1]+dp[i-2];
            }
        }
        return dp[n];


    }
}

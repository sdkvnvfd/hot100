public class 不同的二叉搜索树96 {
    public static void main(String[] args) {
        Solution96 s96=new Solution96();
        int n=4;
        System.out.println(s96.numTrees(n));
        String a="aaa";
        String b=new String("aaa");

        System.out.println(a==b);
    }
}
class Solution96 {
    public int numTrees(int n) {
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        if(n>=2){
            dp[2]=2;
            for(int i=3;i<=n;i++){
                dp[i]=dp[i-1]*2;
                for(int j=1;j<=i-2;j++){
                    dp[i]+=dp[j]*dp[i-1-j];
                }
            }
        }

        return dp[n];
    }
}

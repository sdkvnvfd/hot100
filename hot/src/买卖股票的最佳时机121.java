public class 买卖股票的最佳时机121 {
    public static void main(String[] args) {
        Solution121 s121=new Solution121();
        int[] prices={7,1,5,3,6,4};
        System.out.println(s121.maxProfit(prices));
    }
}
class Solution121 {
    public int maxProfit(int[] prices) {
        int len=prices.length;
        int[][] dp=new int[len][2];
        //dp[i][0]代表第i天不持有股票所得的最大现金，dp[i][1]代表持有股票所得最大现金
        dp[0][0]=0;
        dp[0][1]=-prices[0];
        for(int i=1;i<len;i++){
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1]=Math.max(dp[i-1][1],-prices[i]);
        }
        return dp[len-1][0];
    }
}

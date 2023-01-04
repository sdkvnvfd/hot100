public class 最小路径和64 {
    public static void main(String[] args) {
        Solution64 s64=new Solution64();
        int[][] grid={{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(s64.minPathSum(grid));
    }
}
class Solution64 {
    public int minPathSum(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int[][] dp=new int[row][col];
        dp[0][0]=grid[0][0];
        for(int i=1;i<row;i++){
            dp[i][0]=dp[i-1][0]+grid[i][0];
        }
        for(int j=1;j<col;j++){
            dp[0][j]=dp[0][j-1]+grid[0][j];
        }
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                dp[i][j]=Math.min(dp[i][j-1],dp[i-1][j])+grid[i][j];
            }
        }
        return dp[row-1][col-1];
    }
}

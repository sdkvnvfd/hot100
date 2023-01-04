public class 最长回文子串05 {
}
class Solution05 {
    public String longestPalindrome(String s) {
        int len=s.length();
        if(len<2)
            return s;
        boolean[][] dp=new boolean[len][len];
        int maxLength=1;
        int begin=0;
        char[] chars=s.toCharArray();
        for(int i=0;i<len;i++)
            dp[i][i]=true;
        for(int j=1;j<len;j++){
            for(int i=0;i<j;i++){
                if(chars[i]!=chars[j]){
                    dp[i][j]=false;
                }else{
                    if(j-i<3){
                        dp[i][j]=true;
                    }else{
                        dp[i][j]=dp[i+1][j-1];
                    }
                }
                if(dp[i][j]&&j-i+1>maxLength){
                    maxLength=j-i+1;
                    begin=i;
                }
            }
        }
        return s.substring(begin,begin+maxLength);
    }
    public boolean ishuiwen(String ss){
        int len=ss.length();
        for(int i=0,j=len-1;i<j;i++,j--){
            if(ss.charAt(i)!=ss.charAt(j))
                return false;
        }
        return true;
    }
}

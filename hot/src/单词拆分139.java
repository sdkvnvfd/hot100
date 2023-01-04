import java.util.ArrayList;
import java.util.List;

public class 单词拆分139 {
    public static void main(String[] args) {
        Solution139 s139=new Solution139();
        String s="leetcode";
        List<String> words=new ArrayList<>();
        words.add("leet");
        words.add("code");
        System.out.println(s139.wordBreak(s,words));
    }
}
class Solution139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        int len=s.length();
        boolean[] dp=new boolean[len+1];
        dp[0]=true;
        for(int i=1;i<=len;i++){
            if(dp[i]==true)
                break;
            for(int j=i-1;j>=0;j--){
                if(dp[j]==false)
                    continue;
                else if(wordDict.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[len];
    }
}

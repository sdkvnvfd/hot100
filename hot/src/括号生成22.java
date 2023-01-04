import java.util.ArrayList;
import java.util.List;

public class 括号生成22 {
    public static void main(String[] args) {
        Solution22 s22=new Solution22();
        int n=1;
        System.out.println(s22.generateParenthesis(n));
    }
}
class Solution22 {
    List<String> res=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        String s="";
        dfs(s,n,n);
        return res;
    }

    /**
     *
     * @param s  存放生成的括号
     * @param left 左括号剩余数量
     * @param right  右括号剩余数量
     */
    public void dfs(String s,int left,int right){
        if(left==0&&right==0){
            res.add(s);
            return;
        }
        if(left>right){
            return;
        }
        if(left>0){
            dfs(s+"(",left-1,right);
        }
        if(right>0){
            dfs(s+")",left,right-1);
        }
    }
}

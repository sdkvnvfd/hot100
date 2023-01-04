import java.util.ArrayList;
import java.util.List;

public class 电话号码的字母组合17 {
    public static void main(String[] args) {
        Solution17 s17=new Solution17();
        String digits="";
        s17.letterCombinations(digits);
        System.out.println(s17.res);
    }
}
class Solution17 {
    List<String> res=new ArrayList<>();
    StringBuilder ss=new StringBuilder();
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0||digits==null)
            return res;
        String[] s={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backtrakcing(digits,s,0);
        return res;
    }
    public void backtrakcing(String digits,String[] s,int index){
        if(index==digits.length()){
            res.add(ss.toString());
            return;
        }
        String str=s[digits.charAt(index)-'0'];
        for(int i=0;i<str.length();i++){
            ss.append(str.charAt(i));
            backtrakcing(digits,s,index+1);
            ss.deleteCharAt(ss.length()-1);
        }
    }
}

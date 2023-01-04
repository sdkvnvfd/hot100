import java.lang.invoke.SwitchPoint;
import java.util.Stack;

public class 有效的括号20 {
    public static void main(String[] args) {
        Solution20 s20=new Solution20();
        String s="(]{}";
        System.out.println(s20.isValid(s));
    }
}
class Solution20 {
    Stack<Character> stack=new Stack<>();
    public boolean isValid(String s) {
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                stack.add(s.charAt(i));
            }else{
                if(!stack.isEmpty()&&ismatch(stack.peek(),s.charAt(i))){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public boolean ismatch(Character left,Character right){
        switch (right){
            case ')':
                return left=='(';
            case '}':
                return left=='{';
            case ']':
                return left=='[';
            default:return false;
        }
    }
}

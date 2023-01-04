import java.util.Stack;

public class 最小栈155 {
}
class MinStack155 {
    public Stack<int[]> stack=new Stack<>();
    public MinStack155() {

    }

    public void push(int val) {
        if(stack.isEmpty()){
            stack.push(new int[]{val,val});
        }else{
            stack.push(new int[]{val,Math.min(val,stack.peek()[1])});
        }
    }

    public void pop() {
        if(!stack.isEmpty()){
            stack.pop();
        }
    }

    public int top() {

        return stack.peek()[0];

    }

    public int getMin() {
        return stack.peek()[1];
    }
}

import java.util.Stack;

class MinStack{
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> min1=new Stack<>();
    public void push(int x){
    stack.push(x);
    int min = min1.isEmpty() || x < min1.peek() ? x:min1.peek();
    min1.push(min);
    }
    public void pop(){
    stack.pop();
    min1.pop();
    }
    public int top(){
    return stack.peek();
    }
    public int getMin(){
        return min1.peek();
    }
}
public class MinElementFromStack {
    public static void main(String[] args) {
        MinStack m=new MinStack();
        m.push(2);
        m.push(6);
        m.push(5);
        m.push(1);
        m.pop();
        System.out.println(m.getMin());

    }

}

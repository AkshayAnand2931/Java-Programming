import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        
        Stack<Integer> stk = new Stack<Integer>();

        stk.push(1);
        stk.push(2);
        stk.push(3);

        System.out.println(stk);
        System.out.println(stk.pop());
        System.out.println(stk.peek());
        
        
    }
}

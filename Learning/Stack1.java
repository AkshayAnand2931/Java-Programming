import java.util.Stack;  
    
public class Stack1{  
    public static void main(String[] args){   
    Stack<Integer> stk= new Stack<>();   
    boolean result = stk.empty();  
    System.out.println("Is the stack empty? " + result);  
     
    stk.push(78);  
    stk.push(113);  
    stk.push(90);  
    stk.push(120);  
    
    System.out.println("Elements in Stack: " + stk);  
    result = stk.empty();  
    System.out.println("Is the stack empty? " + result);

    System.out.println(stk.peek());
    System.out.println(stk.pop());
    System.out.println(stk.search(78));
    System.out.println(stk);
    }  
}  

import java.util.*;
class MyQueue {

    Stack<Integer> inp;
    Stack<Integer> out;
    
    public MyQueue() {
        this.inp = new Stack<>();
        this.out = new Stack<>();
    }
    
    public void push(int x) {
        inp.push(x);
    }
    
    public int pop() {
        if(out.isEmpty()){
            while(!inp.isEmpty()){
                out.push(inp.pop());
            }
        }
        return out.pop();
    }
    
    public int peek() {
        if(out.isEmpty()){
            while(!inp.isEmpty()){
                out.push(inp.pop());
            }
        }
        return out.peek();
    }
    
    public boolean empty() {
        return inp.isEmpty() && out.isEmpty();
    }
}
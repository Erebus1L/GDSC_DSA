import java.util.Queue;
import java.util.LinkedList;
public class ImplementStackUsingQueues {
    class MyStack {
        Queue<Integer> queue;
    
        public MyStack() {
            this.queue = new LinkedList<>();
        }
        
        public void push(int x) {
            queue.add(x);
            for(int i=1; i<queue.size(); i++){
                queue.add(queue.peek());
                queue.remove(queue.peek());
            }
        }
        
        public int pop() {
            return queue.remove();
        }
        
        public int top() {
            return queue.peek();
        }
        
        public boolean empty() {
            return queue.isEmpty();
        }
    }
}

import java.util.*;

public class stackqd {
    static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(9);
//        stack.push(1);
//        stack.peek();
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add(4);
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//          Deque<Integer> deque = new ArrayDeque<>();
//          deque.add(9);
//          deque.add(8);
//          deque.addFirst(7);
//          deque.addLast(6);
//        System.out.println(deque.removeFirst());
//        System.out.println(deque.removeLast());
        public int pop() throws Exception {
            if (isEmpty()) {
                throw new Exception("Stack is empty");
            }
            int removed = data[ptr];
            ptr--;
            return removed;
        }

        public boolean push(int item) {
            if (isFull()) {
                System.out.println("Stack is full");
                return false;
            }
            ptr++;
            data[ptr] = item;
            return true;
        }

        public int peek() throws Exception {
            if (isEmpty()) {
                throw new Exception("Stack is empty");
            }
            return data[ptr];
        }
    }
}

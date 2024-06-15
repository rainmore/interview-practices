package au.com.rainmore.datastructure.extra;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class No225ImplementStackUsingQueues {

    class MyStack {

        private Queue<Integer> queue;

        public MyStack() {
            queue = new LinkedList<>();
        }

        public void push(int x) {
            queue.add(x);
            // [1, 2, 3]
            // [1, 2, 3, 4]
            // [2, 3, 4, 1]
            // [3, 4, 1, 2]
            // [4, 1, 2, 3]
            for (int i = 1; i < queue.size(); i++) {
                queue.add(queue.remove());
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

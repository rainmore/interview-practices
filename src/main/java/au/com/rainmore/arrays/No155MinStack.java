package au.com.rainmore.arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/min-stack/">
 * 155. Min Stack</a>
 */
public class No155MinStack {

    private Logger logger = LoggerFactory.getLogger(No155MinStack.class);

    private Stack<Integer> stack;

    private Stack<Integer> min;

    public No155MinStack() {
        this.stack = new Stack<>();
        this.min = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);

        if (min.isEmpty()) {
            min.push(val);
        }
        else {
            int m = Math.min(min.get(min.size() - 1), val);
            min.push(m);
        }

    }

    public void pop() {
        stack.pop();
        min.pop();
    }

    public int top() {
        if (stack.isEmpty()) {
            return 0;
        }
        else {
            return stack.lastElement();
        }
    }

    public int getMin() {
        if (min.isEmpty()) {
            return 0;
        }
        else {
            return min.lastElement();
        }
    }
}

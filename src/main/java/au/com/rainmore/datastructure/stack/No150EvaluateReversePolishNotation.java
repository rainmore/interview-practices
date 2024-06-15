package au.com.rainmore.datastructure.stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/evaluate-reverse-polish-notation/description/">
 * 150. Evaluate Reverse Polish Notation</a>
 */
public class No150EvaluateReversePolishNotation {

    private Logger logger = LoggerFactory.getLogger(No150EvaluateReversePolishNotation.class);

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        int left = 0;
        int right = 0;

        for (String token : tokens) {
            switch (token) {
                case "+":
                    right = stack.pop();
                    left = stack.pop();
                    stack.push(left + right);
                    break;
                case "-":
                    right = stack.pop();
                    left = stack.pop();
                    stack.push(left - right);
                    break;
                case "/":
                    right = stack.pop();
                    left = stack.pop();
                    stack.push(left / right);
                    break;
                case "*":
                    right = stack.pop();
                    left = stack.pop();
                    stack.push(left * right);
                    break;
                default:
                    stack.push(Integer.valueOf(token));
            }
        }

        return stack.peek();
    }

}

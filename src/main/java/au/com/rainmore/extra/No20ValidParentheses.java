package au.com.rainmore.extra;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Stack;
import java.util.regex.Pattern;

/**
 * <a href="https://leetcode.com/problems/baseball-game/description/">
 * 21. Merge Two Sorted Lists</a>
 */
public class No20ValidParentheses {

    private Logger logger = LoggerFactory.getLogger(No20ValidParentheses.class);

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public boolean isValid(String s) {
        Stack<Character> st1 = new Stack<>();

        if (s == null || s.isEmpty()) return true;

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case ')':
                    if (!st1.isEmpty() && st1.peek() == '(') {
                        st1.pop();
                    }
                    else {
                        return false;
                    }
                    break;
                case '}':
                    if (!st1.isEmpty() && st1.peek() == '{') {
                        st1.pop();
                    }
                    else {
                        return false;
                    }
                    break;
                case ']':
                    if (!st1.isEmpty() && st1.peek() == '[') {
                        st1.pop();
                    }
                    else {
                        return false;
                    }
                    break;
                default:
                    st1.add(s.charAt(i));
                    break;
            }
        }

        return st1.isEmpty();
    }



}

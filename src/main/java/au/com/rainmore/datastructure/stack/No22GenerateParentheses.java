package au.com.rainmore.datastructure.stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/generate-parentheses/description/">
 * 22. Generate Parentheses</a>
 */
public class No22GenerateParentheses {

    private Logger logger = LoggerFactory.getLogger(No22GenerateParentheses.class);

    public List<String> generateParenthesis(int n) {
        Deque<Character> stack = new ArrayDeque<>();
        List<String> res = new ArrayList<>();
        backtrack(n, 0, 0, stack, res);
        return res;
    }

    private void backtrack(int n, int openN, int closeN, Deque<Character> stack, List<String> res) {
        if (openN == closeN && closeN == n) {
            Iterator<Character> val = stack.iterator();
            String tmp = "";
            while(val.hasNext()) {
                tmp =  val.next() + tmp;
                logger.info("tmp: {}", tmp);
            }
            res.add(tmp);
        }

        if (openN < n) {
            stack.push('(');
            backtrack(n, openN + 1, closeN, stack, res);
            stack.pop();
        }

        if (openN > closeN) {
            stack.push(')');
            backtrack(n, openN, closeN + 1, stack, res);
            stack.pop();
        }

    }

}

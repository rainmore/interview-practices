package au.com.rainmore.extra;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/baseball-game/description/">
 * 21. Merge Two Sorted Lists</a>
 */
public class No682BaseballGame {

    private Logger logger = LoggerFactory.getLogger(No682BaseballGame.class);

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public int calPoints(String[] operations) {
        int c = 0;
        int[] s = new int[operations.length];
        int sum = 0;
        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "C":
                    if (c > 0) {
                        sum -= s[c - 1];
                        s[--c] = 0;
                    }
                    break;
                case "D":
                    s[c] = s[c - 1] * 2;
                    sum += s[c];
                    c++;
                    break;
                case "+":
                    s[c] = s[c - 1] + s[c - 2];
                    sum += s[c];
                    c++;
                    break;
                default:
                    s[c] = Integer.parseInt(operations[i]);
                    sum += s[c];
                    c++;
                    break;
            }
        }


        return sum;
    }

}

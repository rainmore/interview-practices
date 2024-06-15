package au.com.rainmore.datastructure.stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/daily-temperatures/description/">
 * 739. Daily Temperatures</a>
 */
public class No739DailyTemperatures {

    private Logger logger = LoggerFactory.getLogger(No739DailyTemperatures.class);

    public int[] dailyTemperatures(int[] temperatures) {
        int[] data = new int[temperatures.length];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            while(!stack.isEmpty()
                    && temperatures[i] > temperatures[stack.peek()]) {
                int prev = stack.pop();
                data[prev] = i - prev;
            }
            stack.push(i);
        }

        return data;
    }

}

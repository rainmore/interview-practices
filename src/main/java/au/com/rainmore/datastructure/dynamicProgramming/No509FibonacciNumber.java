package au.com.rainmore.datastructure.dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/fibonacci-number/">
 * 509. Fibonacci Number</a>
 */
public class No509FibonacciNumber {

    /**
     * Brute Force
     *
     * Time complexity: O(n)
     * Space complexity: O(n)
     */
    public int fibonacci1(int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        return fibonacci1(n - 1) + fibonacci1(n - 2);
    }

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public int fibonacci2(int n) {
        int[] c = new int[n + 2];
        c[n + 1] = 1;

        for (int i = n - 1; i >= 0; i--) {
            c[i] = c[i + 1] + c[i + 2];
        }

        return c[0];
    }

    /**
     * Dynamic Programming
     *
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public int fibonacci3(int n) {
        int l = 1;
        int r = 0;

        for (int i = 0; i < n - 1; i++) {
            int t = l;
            l = l + r;
            r = t;
        }

        return l;
    }

    /**
     * Dynamic Programming
     * bottom up
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public int fibonacci3a(int n) {
        if (n < 2) {
            return n;
        }

        int[] dp = new int[]{0, 1};
        int i = 2;
        while (i <= n) {
            int tmp = dp[1];
            dp[1] = dp[0] + dp[1];
            dp[0] = tmp;
            i++;
        }
        return dp[1];
    }

    private Map<Integer, Integer> cache = new HashMap<>();

    /**
     * Memorization
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public int fibonacci(int n) {
        if (n <= 1) return n;

        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        cache.put(n, fibonacci(n - 1) + fibonacci(n));
        return cache.get(n);
    }
}

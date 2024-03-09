package au.com.rainmore.extra;

/**
 * <a href="https://leetcode.com/problems/fibonacci-number/">
 * 509. Fibonacci Number</a>
 */
public class No509FibonacciNumber {

    /**
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
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public int fibonacci(int n) {
        int l = 1;
        int r = 0;

        for (int i = 0; i < n - 1; i++) {
            int t = l;
            l = l + r;
            r = t;
        }

        return l;
    }

}

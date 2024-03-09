package au.com.rainmore.extra;


/**
 * <a href="https://leetcode.com/problems/climbing-stairs/">
 * 70. Climbing Stairs</a>
 *
 * Brule Force
 *
 * Solutions:
 * DFS O(2^N)
 * DP O(n) -- Bottom up (see {@link No509FibonacciNumber}
 *
 */
public class No70ClimbingStairs {

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public int climbStairs(int n) {
        int l = 1;
        int r = 1;

        for (int i = 0; i < n - 1; i++) {
            int t = l;
            l = l + r;
            r = t;
        }

        return l;
    }


}

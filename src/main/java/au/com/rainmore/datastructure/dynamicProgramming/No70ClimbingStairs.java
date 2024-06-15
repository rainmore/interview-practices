package au.com.rainmore.datastructure.dynamicProgramming;


/**
 * <a href="https://leetcode.com/problems/climbing-stairs/">
 * 70. Climbing Stairs</a>
 *
 * Brule Force
 * Solutions:
 * DFS O(2^N)
 *
 */
public class No70ClimbingStairs {

    /**
     * DP O(n) -- Bottom up
     *
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

    /**
     * DP O(n) -- Bottom up
     *
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public int climbStairs2(int n) {
        int[] c = new int[n + 2];
        c[n + 1] = 1;

        for (int i = n - 1; i >= 0; i--) {
            c[i] = c[i + 1] + c[i + 2];
        }

        return c[0];
    }

}

package au.com.rainmore.dynamicProgramming;


/**
 * <a href="https://leetcode.com/problems/house-robber/description/">
 * 198. House Robber</a>
 */
public class No198HouseRobber {

    public int rob(int[] nums) {
        int v1 = 0;
        int v2 = 0;

        for (int n : nums) {
            int tmp = Math.max(n + v1, v2);
            v1 = v2;
            v2 = tmp;
        }
        return v2;
    }

}

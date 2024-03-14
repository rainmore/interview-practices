package au.com.rainmore.dynamicProgramming;


/**
 * <a href="https://leetcode.com/problems/unique-paths-ii/">
 * 63. Unique Paths II</a>
 */
public class No63UniquePathsII {

    /**
     * DP O(n) -- Bottom up
     *
     * Time complexity: O(m*n)
     * Space complexity: O(m*n)
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rowLength = obstacleGrid.length;
        int columnLength = obstacleGrid[0].length;

        int[] dp = new int[columnLength];
        dp[columnLength - 1] = 1;

        for (int r = rowLength - 1; r >= 0; r--) {
            for (int c = columnLength - 1; c >= 0; c--) {
                if (obstacleGrid[r][c] == 1) {
                    dp[c] = 0;
                }
                else if (c + 1 < columnLength) {
                    dp[c] = dp[c] + dp[c + 1];
                }
            }
        }

        return dp[0];
    }

}

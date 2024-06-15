package au.com.rainmore.datastructure.dynamicProgramming;


/**
 * <a href="https://leetcode.com/problems/unique-paths/description/">
 * 62. Unique Paths</a>
 */
public class No62UniquePaths {

    /**
     * DP O(n) -- Bottom up
     *
     * Time complexity: O(m*n)
     * Space complexity: O(m*n)
     */
    public int uniquePaths(int m, int n) {
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            matrix[i][n - 1] = 1;
        }

        for (int j = 0; j < n; j++) {
            matrix[m - 1][j] = 1;
        }

        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                int right = matrix[i][j + 1];
                // the last row is always 1
                int bottom = matrix[i + 1][j];
                matrix[i][j] = right + bottom;
            }
        }

        return matrix[0][0];
    }

    /**
     * DP O(n) -- Bottom up
     *
     * Time complexity: O(m*n)
     * Space complexity: O(min(m,n))
     */
    public int uniquePaths1(int m, int n) {
        if (m <= 0 || n <= 0) return 0;
        int[] row = new int[n];

        for (int i = 0; i < n; i++) {
            row[i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; i < n; j++) {
                row[j] += row[j - 1];
            }
        }

        return row[n - 1];
    }

    /**
     * DP O(n) -- Bottom up
     *
     * Time complexity: O(min(m,n))
     * Space complexity: O(1)
     */
    public int uniquePaths2(int m, int n) {
        if (m <= 0 || n <= 0) return 0;
        if (m < n) return uniquePaths2(n, m);

        m--;
        n--;
        long res = 1;
        for (int i = 1; i <= n; i++) {
            res *= (m + i);
            res /= i;
        }
        return (int)res;
    }

}

package au.com.rainmore.datastructure;

/**
 * <a href="https://leetcode.com/problems/search-a-2d-matrix/">
 *     74. Search a 2D Matrix</a>
 *
 * Time Complexity:O(log n)
 * Space Complexity:O(1)
 */
public class No74SearchA2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int r = matrix.length - 1;

        int rl = matrix[0].length;

        while (l <= r) {
            int m = (r + l) / 2;
            if (target < matrix[m][0]) {
                r = m - 1;
            }
            else if (target > matrix[m][rl - 1]) {
                l = m + 1;
            }
            else {
                return searchRow(matrix[m], target);
            }
        }

        return false;
    }

    private boolean searchRow(int[] row, int target) {
        int l = 0;
        int r = row.length - 1;

        while (l <= r) {
            int m = (r + l) / 2;

            if (target < row[m]) {
                r = m - 1;
            }
            else if (target > row[m]) {
                l = m + 1;
            }
            else {
                return true;
            }
        }
        return false;
    }

}

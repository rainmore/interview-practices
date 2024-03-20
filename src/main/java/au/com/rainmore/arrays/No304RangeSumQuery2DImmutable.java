package au.com.rainmore.arrays;


/**
 * <a href="https://leetcode.com/problems/range-sum-query-2d-immutable/description/">
 * 304. Range Sum Query 2D - Immutable</a>
 * <p>
 * Time Complexity: O(1)
 * Space Complexity: O(m * n)
 */
public class No304RangeSumQuery2DImmutable {

    public static class NumMatrix {

        private int[][] sum;

        public NumMatrix(int[][] matrix) {
            sum = new int[matrix.length + 1][matrix[0].length + 1];
            for (int i = 0; i < matrix.length; i++) {
                int prefix = 0;
                for (int j = 0; j < matrix[0].length; j++) {
                    prefix += matrix[i][j];
                    int above = sum[i][j + 1];
                    sum[i + 1][j + 1] = prefix + above ;
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            row1 = row1 + 1;
            row2 = row2 + 1;
            col1 = col1 + 1;
            col2 = col2 + 1;

            int bottomRight = sum[row2][col2];
            int topLeft = sum[row1 - 1][col1 - 1];
            int above = sum[row1 - 1][col2];
            int left = sum[row2][col1 - 1];

            return bottomRight - above - left + topLeft;
        }
    }

}

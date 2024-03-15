package au.com.rainmore.graphs;


/**
 * <a href="https://leetcode.com/problems/number-of-islands/description/">
 * 200. Number of Islands</a>
 *
 * Time O(4 ^ (n * m()
 * Space O(n * m)
 *
 */
public class No200NumberOfIslands {

    public int numIslands(char[][] grid) {
        int c = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    c++;
                }
            }
        }
        return c;
    }

    private void dfs(char[][] grid, int i, int j) {
        if (
            i < 0 || j < 0 ||
            i >= grid.length || j >= grid[0].length ||
            grid[i][j] == '0'
        ) {
            return;
        }

        grid[i][j] = '0';
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }
}

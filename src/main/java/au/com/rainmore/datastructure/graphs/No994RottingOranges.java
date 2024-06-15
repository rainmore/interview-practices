package au.com.rainmore.datastructure.graphs;


import java.util.LinkedList;
import java.util.Queue;

/**
 * <a href="https://leetcode.com/problems/rotting-oranges/description/">
 * 994. Rotting Oranges</a>
 *
 * Time O(n * m)
 * Space O(n * m)
 */
public class No994RottingOranges {

    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int freshCount = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    freshCount +=1;
                }
                else if (grid[i][j] == 2) {
                    queue.add(new int[]{i, j});
                }
            }
        }

        int[][] directions = new int[][] {
                new int[]{0,1},
                new int[]{0,-1},
                new int[]{1,0},
                new int[]{-1,0},
        };

        int result = 0;
        while(!queue.isEmpty() && freshCount > 0) {
            result++;
            int queueSize = queue.size();

            for (int i = 0; i < queueSize; i++) {
                int[] rotten = queue.poll();
                int r = rotten[0];
                int c = rotten[1];

                for (int[] dir : directions) {
                    int x = r + dir[0];
                    int y = c + dir[1];
                    if (x >=0 && y >=0 && x < m &&  y < n && grid[x][y] == 1) {
                        grid[x][y] = 2;
                        queue.add(new int[] {x, y});
                        freshCount--;
                    }
                }
            }

        }

        return freshCount == 0 ? result : -1;
    }

}

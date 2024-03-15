package au.com.rainmore.graphs;


import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * <a href="https://leetcode.com/problems/shortest-path-in-binary-matrix/description/">
 * 1091. Shortest Path in Binary Matrix</a>
 */
public class No1091ShortestPathInBinaryMatrix {

    private class Node {

        int r;
        int c;
        int l;

        public Node(int r, int c, int l) {
            this.r = r;
            this.c = c;
            this.l = l;
        }

        public Node(int r, int c) {
            this(r, c, 0);
        }
    }

    /**
     * Time O(m * n) => O(n ^ 2)
     */
    public int shortestPathBinaryMatrix1(int[][] grid) {
        int l = grid.length;
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(0, 0, 1));

        boolean[][] cache = new boolean[l][l];
        cache[0][0] = true;

        Map<String, Node> directions = Map.of(
                "right", new Node(0, 1),
                "left", new Node(0, -1),
                "up", new Node(-1, 0),
                "down", new Node(1, 0),
                "up-right", new Node(-1, 1),
                "up-left", new Node(-1, -1),
                "down-right", new Node(1, 1),
                "down-left", new Node(1, -1));

        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            if (Math.min(curr.c, curr.r) < 0 ||
                    Math.max(curr.c, curr.r) == l ||
                    grid[curr.r][curr.c] == 1) {
                continue;
            }
            if (curr.r == l - 1 && curr.c == l - 1) {
                return curr.l;
            }

            for (Node node : directions.values()) {
                Node tmp = new Node(curr.r + node.r, curr.c + node.c);
                if (Math.min(tmp.c, tmp.r) >= 0 &&
                        Math.max(tmp.c, tmp.r) < l &&
                        !cache[tmp.r][tmp.c]) {
                    queue.add(new Node(tmp.r, tmp.c, curr.l + 1));
                    cache[tmp.r][tmp.c] = true;
                }
            }
        }

        return -1;
    }

    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] == 1 || grid[grid.length - 1][grid[0].length - 1] == 1) {
            return -1;
        }

        int n = grid.length;
        int[] dx = {-1, 0, 1};
        int[] dy = {-1, 0, 1};

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1});
        grid[0][0] = 1;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0];
            int y = curr[1];
            int steps = curr[2];

            if (x == n - 1 && y == n - 1) {
                return steps;
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int nx = x + dx[i];
                    int ny = y + dy[j];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && grid[nx][ny] == 0) {
                        queue.offer(new int[]{nx, ny, steps + 1});
                        grid[nx][ny] = 1;
                    }
                }
            }
        }
        return -1;
    }

}

package au.com.rainmore.datastructure.graphs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class No1091ShortestPathInBinaryMatrixTest {

    private No1091ShortestPathInBinaryMatrix test = new No1091ShortestPathInBinaryMatrix();

    @Test
    void test1() {
        int[][] grid = new int[][]{
                new int[]{0,0,0},
                new int[]{1,1,0},
                new int[]{1,1,0}
        };

        int r = test.shortestPathBinaryMatrix(grid);
        assertEquals(4, r);
    }

    @Test
    void test2() {
        int[][] grid = new int[][]{
                new int[]{0,1},
                new int[]{1,0}
        };

        int r = test.shortestPathBinaryMatrix(grid);
        assertEquals(2, r);
    }

    @Test
    void test3() {
        int[][] grid = new int[][]{
                new int[]{1,0,0},
                new int[]{1,1,0},
                new int[]{1,1,0}
        };

        int r = test.shortestPathBinaryMatrix(grid);
        assertEquals(-1, r);
    }

}

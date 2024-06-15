package au.com.rainmore.datastructure.graphs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class No994RottingOrangesTest {

    private No994RottingOranges test = new No994RottingOranges();

    @Test
    void test1() {
        int[][] grid = new int[][]{
                new int[]{2,1,1},
                new int[]{1,1,0},
                new int[]{0,1,1}
        };
        int r = test.orangesRotting(grid);

        assertEquals(4, r);
    }

    @Test
    void test2() {
        int[][] grid = new int[][]{
                new int[]{2,1,1},
                new int[]{0,1,1},
                new int[]{1,0,1}
        };
        int r = test.orangesRotting(grid);

        assertEquals(-1, r);
    }

    @Test
    void test3() {
        int[][] grid = new int[][]{
                new int[]{0,2}
        };
        int r = test.orangesRotting(grid);

        assertEquals(0, r);
    }

}

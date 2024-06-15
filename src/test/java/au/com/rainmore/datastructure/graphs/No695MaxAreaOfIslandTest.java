package au.com.rainmore.datastructure.graphs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class No695MaxAreaOfIslandTest {

    private No695MaxAreaOfIsland test = new No695MaxAreaOfIsland();

    @Test
    void test1() {
        int[][] data = new int[][]{
                new int[]{0, 0, 0, 0, 0, 0, 0, 0}
        };

        int r = test.maxAreaOfIsland(data);

        assertEquals(0, r);
    }

    @Test
    void test2() {
        int[][] data = new int[][]{
                new int[]{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                new int[]{0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                new int[]{0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                new int[]{0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                new int[]{0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                new int[]{0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                new int[]{0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };

        int r = test.maxAreaOfIsland(data);

        assertEquals(6, r);
    }

}

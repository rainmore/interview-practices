package au.com.rainmore.datastructure.graphs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class No200NumberOfIslandsTest {

    private No200NumberOfIslands test = new No200NumberOfIslands();

    @Test
    void test1() {
        char[][] data = new char[][]{
                new char[]{'1','1','1','1','0'},
                new char[]{'1','1','0','1','0'},
                new char[]{'1','1','0','0','0'},
                new char[]{'0','0','0','0','0'}
        };

        int result = test.numIslands(data);

        assertEquals(1, result);
    }

    @Test
    void test2() {
        char[][] data = new char[][]{
                new char[]{'1','1','0','0','0'},
                new char[]{'1','1','0','0','0'},
                new char[]{'0','0','1','0','0'},
                new char[]{'0','0','0','1','1'}
        };

        int result = test.numIslands(data);

        assertEquals(3, result);
    }

    @Test
    void test3() {
        char[][] data = new char[][]{
                new char[]{'1'},
                new char[]{'1'},

        };

        int result = test.numIslands(data);

        assertEquals(1, result);
    }


}

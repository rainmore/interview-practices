package au.com.rainmore.datastructure.arrays;

import org.junit.jupiter.api.Test;

import au.com.rainmore.datastructure.arrays.No304RangeSumQuery2DImmutable.NumMatrix;

import static org.junit.jupiter.api.Assertions.assertEquals;

class No304RangeSumQuery2DImmutableTest {


    @Test
    void test1() {
        int[][] matrix = new int[][]{
                new int[]{3, 0, 1, 4, 2},
                new int[]{5, 6, 3, 2, 1},
                new int[]{1, 2, 0, 1, 5},
                new int[]{4, 1, 0, 1, 7},
                new int[]{1, 0, 3, 0, 5}
        };

        NumMatrix test = new NumMatrix(matrix);

        int r1 = test.sumRegion(2, 1, 4, 3);
        int r2 = test.sumRegion(1, 1, 2, 2);
        int r3 = test.sumRegion(1, 2, 2, 4);


        assertEquals(8, r1);
        assertEquals(11, r2);
        assertEquals(12, r3);
    }

}

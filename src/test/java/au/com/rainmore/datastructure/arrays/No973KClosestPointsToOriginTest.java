package au.com.rainmore.datastructure.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class No973KClosestPointsToOriginTest {

    private No973KClosestPointsToOrigin test = new No973KClosestPointsToOrigin();

    @Test
    void test1() {
        int[][] data = new int[][]{new int[]{1,3}, new int[]{-2, 2}};
        int k = 1;

        int[][] r = test.kClosest(data, k);

        assertEquals(1, r.length);
        assertArrayEquals(new int[]{-2, 2}, r[0]);;
    }

    @Test
    void test2() {
        int[][] data = new int[][]{
                new int[]{3,3},
                new int[]{5, -1},
                new int[]{-2, 4}
        };
        int k = 2;

        int[][] r = test.kClosest(data, k);

        assertEquals(2, r.length);
        assertArrayEquals(new int[]{3,3}, r[0]);
        assertArrayEquals(new int[]{-2,4}, r[1]);
    }

}

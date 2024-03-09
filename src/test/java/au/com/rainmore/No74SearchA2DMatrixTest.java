package au.com.rainmore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class No74SearchA2DMatrixTest {

    private No74SearchA2DMatrix test = new No74SearchA2DMatrix();


    @Test
    void test1() {
        int[][] matrix = new int[][]{
                new int[]{1,3,5,7},
                new int[]{10,11,16,20},
                new int[]{23,30,34,60}
        };

        boolean r = test.searchMatrix(matrix, 3);
        assertTrue(r);
    }


    @Test
    void test2() {
        int[][] matrix = new int[][]{
                new int[]{1,3,5,7},
                new int[]{10,11,16,20},
                new int[]{23,30,34,60}
        };

        boolean r = test.searchMatrix(matrix, 13);
        assertFalse(r);
    }



}

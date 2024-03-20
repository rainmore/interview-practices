package au.com.rainmore.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class No724FindPivotIndexTest {

    private No724FindPivotIndex test = new No724FindPivotIndex();


    @Test
    void test1() {

        int[] nums = new int[]{1,7,3,6,5,6};

        int r = test.pivotIndex(nums);

        assertEquals(3, r);
    }

    @Test
    void test2() {

        int[] nums = new int[]{1,2,3};

        int r = test.pivotIndex(nums);

        assertEquals(-1, r);
    }

    @Test
    void test3() {

        int[] nums = new int[]{2,1,-1};

        int r = test.pivotIndex(nums);

        assertEquals(0, r);
    }

    @Test
    void test4() {

        int[] nums = new int[]{-1,-1,0,0,-1,-1};

        int r = test.pivotIndex(nums);

        assertEquals(2, r);
    }

}

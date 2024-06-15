package au.com.rainmore.datastructure.dynamicProgramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class No70ClimbingStairsTest {

    private No70ClimbingStairs test = new No70ClimbingStairs();

    @Test
    void test1() {
        int r = test.climbStairs(2);
        assertEquals(2, r);
    }

    @Test
    void test2() {
        int r = test.climbStairs(3);
        assertEquals(3, r);
    }

    @Test
    void test3() {
        int r = test.climbStairs(5);
        assertEquals(8, r);
    }

}

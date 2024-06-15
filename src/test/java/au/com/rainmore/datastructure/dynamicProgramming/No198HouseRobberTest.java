package au.com.rainmore.datastructure.dynamicProgramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class No198HouseRobberTest {

    private No198HouseRobber test = new No198HouseRobber();

    @Test
    void test1() {
        int[] data = new int[]{1,2,3,1};
        int r = test.rob(data);

        assertEquals(4, r);
    }

    @Test
    void test2() {
        int[] data = new int[]{2,7,9,3,1};
        int r = test.rob(data);

        assertEquals(12, r);
    }

}

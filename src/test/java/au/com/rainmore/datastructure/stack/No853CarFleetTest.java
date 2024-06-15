package au.com.rainmore.datastructure.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class No853CarFleetTest {

    private No853CarFleet test = new No853CarFleet();

    @Test
    void test1() {
        int target = 12;
        int[] position = new int[]{10,8,0,5,3};
        int[] speed = new int[]{2,4,1,1,3};

        int result = test.carFleet(target, position, speed);

        assertEquals(3, result);
    }

    @Test
    void test2() {
        int target = 10;
        int[] position = new int[]{3};
        int[] speed = new int[]{5};

        int result = test.carFleet(target, position, speed);

        assertEquals(1, result);
    }

    @Test
    void test3() {
        int target = 100;
        int[] position = new int[]{0,2,4};
        int[] speed = new int[]{4,2,1};

        int result = test.carFleet(target, position, speed);

        assertEquals(1, result);
    }

}

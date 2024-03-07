package au.com.rainmore;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class No45JumpGame2Test {


    private static Logger logger = LoggerFactory.getLogger(No45JumpGame2Test.class);

    private No45JumpGame2 test = new No45JumpGame2();

    @Test
    void testCanJump1() {
        int[] nums = new int[]{2,3,1,1,4};
        int r = test.jump(nums);
        assertEquals(2, r);
    }

    @Test
    void testCanJump2() {
        int[] nums = new int[]{2,3,0,1,4};
        int r = test.jump(nums);
        assertEquals(2, r);
    }

    @Test
    void testCanJump3() {
        int[] nums = new int[]{0,1};
        int r = test.jump(nums);
        assertEquals(0, r);
    }

    @Test
    void testCanJump4() {
        int[] nums = new int[]{2,0,0};
        int r = test.jump(nums);
        assertEquals(2, r);
    }
}

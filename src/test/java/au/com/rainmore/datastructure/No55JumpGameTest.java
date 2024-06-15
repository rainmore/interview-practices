package au.com.rainmore.datastructure;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class No55JumpGameTest {


    private static Logger logger = LoggerFactory.getLogger(No55JumpGameTest.class);

    private No55JumpGame test = new No55JumpGame();

    @Test
    void testCanJump1() {
        int[] nums = new int[]{2,3,1,1,4};
        boolean r = test.canJump(nums);
        assertTrue(r);
    }

    @Test
    void testCanJump2() {
        int[] nums = new int[]{3,2,1,0,4};
        boolean r = test.canJump(nums);
        assertFalse(r);
    }

    @Test
    void testCanJump3() {
        int[] nums = new int[]{0,1};
        boolean r = test.canJump(nums);
        assertFalse(r);
    }

    @Test
    void testCanJump4() {
        int[] nums = new int[]{2,0,0};
        boolean r = test.canJump(nums);
        assertTrue(r);
    }
}

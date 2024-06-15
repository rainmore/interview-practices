package au.com.rainmore.datastructure;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class No189RotateArrayTest {

    private Logger logger = LoggerFactory.getLogger(No189RotateArrayTest.class);

    private No189RotateArray test = new No189RotateArray();

    @Test
    void testRotateRight1() {
        int[] n1 = new int[]{1,2,3,4,5,6,7};
        int k = 3;
        logger.info("Given n1: {}, k: {}", n1, k);
        test.rotateRight(n1, k);
        int[] expected = new int[]{5,6,7,1,2,3,4};
        assertArrayEquals(expected, n1);
    }

    @Test
    void testRotateRight2() {
        int[] n1 = new int[]{-1,-100,3,99};
        int k = 2;
        logger.info("Given n1: {}, k: {}", n1, k);
        test.rotateRight(n1, k);

        int[] expected = new int[]{3,99,-1,-100};
        assertArrayEquals(expected, n1);
    }
}

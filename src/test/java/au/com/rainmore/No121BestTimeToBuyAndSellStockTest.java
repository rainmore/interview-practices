package au.com.rainmore;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class No121BestTimeToBuyAndSellStockTest {

    private Logger logger = LoggerFactory.getLogger(No121BestTimeToBuyAndSellStockTest.class);

    private No121BestTimeToBuyAndSellStock test = new No121BestTimeToBuyAndSellStock();

    @Test
    void testMaxProfit1() {
        int[] n1 = new int[]{7,1,5,3,6,4};
        int r = test.maxProfit(n1);
        logger.info("Given n1: {}, result: {}", n1, r);
        assertEquals(5, r);
    }

    @Test
    void testMaxProfit2() {
        int[] n1 = new int[]{7,6,4,3,1};
        int r = test.maxProfit(n1);
        logger.info("Given n1: {}, result: {}", n1, r);
        assertEquals(0, r);
    }

    @Test
    void testMaxProfit3() {
        int[] n1 = new int[]{2,1,4};
        int r = test.maxProfit(n1);
        logger.info("Given n1: {}, result: {}", n1, r);
        assertEquals(3, r);
    }

    @Test
    void testMaxProfit4() {
        int[] n1 = new int[]{2,4,1};
        int r = test.maxProfit(n1);
        logger.info("Given n1: {}, result: {}", n1, r);
        assertEquals(2, r);
    }

    @Test
    void testMaxProfit5() {
        int[] n1 = new int[]{3,2,6,5,0,3};
        int r = test.maxProfit(n1);
        logger.info("Given n1: {}, result: {}", n1, r);
        assertEquals(4, r);
    }

    @Test
    void testMaxProfit6() {
        int[] n1 = new int[]{2,1,2,1,0,1,2};
        int r = test.maxProfit(n1);
        logger.info("Given n1: {}, result: {}", n1, r);
        assertEquals(2, r);
    }
}

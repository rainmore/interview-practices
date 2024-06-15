package au.com.rainmore.datastructure;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

class No122BestTimeToBuyAndSell2StockTest {

    private Logger logger = LoggerFactory.getLogger(No122BestTimeToBuyAndSell2StockTest.class);

    private No122BestTimeToBuyAndSell2Stock test = new No122BestTimeToBuyAndSell2Stock();

    @Test
    void testMaxProfit1() {
        int[] n1 = new int[]{7,1,5,3,6,4};
        int r = test.maxProfit(n1);
        logger.info("Given n1: {}, result: {}", n1, r);
        assertEquals(7, r);
    }

    @Test
    void testMaxProfit2() {
        int[] n1 = new int[]{1,2,3,4,5};
        int r = test.maxProfit(n1);
        logger.info("Given n1: {}, result: {}", n1, r);
        assertEquals(4, r);
    }

    @Test
    void testMaxProfit3() {
        int[] n1 = new int[]{7,6,4,3,1};
        int r = test.maxProfit(n1);
        logger.info("Given n1: {}, result: {}", n1, r);
        assertEquals(0, r);
    }

}

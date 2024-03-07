package au.com.rainmore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <a href="https://leetcode.com/problems/jump-game/?envType=study-plan-v2&envId=top-interview-150">
 * 121. Best Time to Buy and Sell Stock</a>
 */
public class No122BestTimeToBuyAndSell2Stock {

    private Logger logger = LoggerFactory.getLogger(No122BestTimeToBuyAndSell2Stock.class);

    private int c = 0;

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     */

    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }

}

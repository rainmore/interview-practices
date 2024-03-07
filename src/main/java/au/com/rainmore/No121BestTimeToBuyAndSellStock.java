package au.com.rainmore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=study-plan-v2&envId=top-interview-150">
 * 121. Best Time to Buy and Sell Stock</a>
 */
public class No121BestTimeToBuyAndSellStock {

    private Logger logger = LoggerFactory.getLogger(No121BestTimeToBuyAndSellStock.class);

    private int c = 0;

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     */

    public int maxProfit(int[] prices) {
        int leftPointer = 0;
        int rightPointer = 1;
        int maxDifference = 0;

        while (rightPointer < prices.length) {
            if (prices[rightPointer] > prices[leftPointer]) {
                int diff = prices[rightPointer] - prices[leftPointer];
                if (diff > maxDifference) {
                    maxDifference = diff;
                }
            } else {
                leftPointer = rightPointer;
            }
            rightPointer++;
        }
        return maxDifference;
    }

    public int maxProfit3(int[] prices) {
        int buy = Integer.MAX_VALUE, sell = 0;
        for (int i = 0; i < prices.length; i++) {
            buy = Math.min(buy, prices[i]);
            sell = Math.max(sell, prices[i] - buy);
        }
        return sell;
    }


    public int maxProfit2(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lsf) {
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if (op < pist) {
                op = pist;
            }
        }
        return op;
    }

}

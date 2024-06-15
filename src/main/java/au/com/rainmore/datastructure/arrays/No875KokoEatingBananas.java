package au.com.rainmore.datastructure.arrays;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/koko-eating-bananas/">
 *     875. Koko Eating Bananas</a>
 *
 * Time Complexity:O(log n)
 * Space Complexity:O(1)
 */
public class No875KokoEatingBananas {

    private Logger logger = LoggerFactory.getLogger(No875KokoEatingBananas.class);

    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int ans = r;
        while (l <= r) {
            int m = (l + r) / 2;
            int hours = 0;
            for (int i : piles) {
                hours += Math.ceil( 1.0 * i / m);
            }

            if (hours <= h) {
                ans = Math.min(ans, m);
                r = m - 1;
            }
            else {
                l = m + 1;
            }
        }
        return ans;
    }

}

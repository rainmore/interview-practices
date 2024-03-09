package au.com.rainmore.extra;


import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/koko-eating-bananas/">
 *     875. Koko Eating Bananas</a>
 *
 * Time Complexity:O(log n)
 * Space Complexity:O(1)
 */
public class No875KokoEatingBananas {

    public int minEatingSpeed(int[] piles, int h) {
        int l = 0;
        int r = Arrays.stream(piles).max().getAsInt();
        int ans = r;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int hours = 0;
            for (int i : piles) {
                hours += Math.ceil(i / m);
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

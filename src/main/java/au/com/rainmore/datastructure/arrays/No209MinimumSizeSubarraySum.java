package au.com.rainmore.datastructure.arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <a href="https://leetcode.com/problems/minimum-size-subarray-sum/description/">
 * 209. Minimum Size Subarray Sum</a>
 */
public class No209MinimumSizeSubarraySum {

    private Logger logger = LoggerFactory.getLogger(No209MinimumSizeSubarraySum.class);


    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int length = Integer.MAX_VALUE;
        int l = 0;

        for (int i = 0 ; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                length = Math.min(i - l + 1, length);
                sum -= nums[l];
                l++;
            }
        }

        return (length != Integer.MAX_VALUE) ? length : 0;
    }
}

package au.com.rainmore.datastructure.extra;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <a href="https://leetcode.com/problems/merge-two-sorted-lists/">
 * 21. Merge Two Sorted Lists</a>
 */
public class No1929ConcatenationOfArray {

    private Logger logger = LoggerFactory.getLogger(No1929ConcatenationOfArray.class);

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public int[] getConcatenation(int[] nums) {
        int[] r = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            r[i] = nums[i];
            r[i + nums.length] = nums[i];
        }
        return r;
    }

}

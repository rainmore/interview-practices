package au.com.rainmore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150">
 * 27. Remove Element</a>
 * <p>
 * Note: the output of Example 2 `nums = [0,1,4,0,3,_,_,_]` is wrong.
 * The correct value is `nums = [0,1,3,0,4,_,_,_]`
 */
public class No27RemoveElement {

    private static Logger logger = LoggerFactory.getLogger(No27RemoveElement.class);

    /**
     * Time complexity:O(n)
     * Space complexity: O(1)
     */
    public int removeElement(int[] nums, int val) {
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[idx++] = nums[i];
            }
        }

        return idx;
    }

    public int removeElement1(int[] nums, int val) {
        int c = 0;
        int[] changedNums = Arrays.copyOf(nums, nums.length);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 0;
            if (val != changedNums[i]) {
                nums[c] = changedNums[i];
                c++;
            }
            logger.info("nums[{}]: {}, c: {}", i, nums[i], c);
        }
        return c;
    }

}

package au.com.rainmore.linkedLists;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <a href="https://leetcode.com/problems/find-the-duplicate-number/description/">
 *     287. Find the Duplicate Number</a>
 *
 *
 */
public class No287FindTheDuplicateNumber {

    private Logger logger = LoggerFactory.getLogger(No21MergeTwoSortedLists.class);

    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        while(fast != slow);

        int slow2 = 0;
        do {
            slow2 = nums[slow2];
            slow = nums[slow];
        }
        while (slow != slow2);
        return slow2;
    }


}

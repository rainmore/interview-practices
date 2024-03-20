package au.com.rainmore.arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/">
 *     26. Remove Duplicates from Sorted Array</a>
 * Time complexity: O(n)
 * Space complexity: O(1)
 */
public class No26RemoveDuplicatedFromSortedArray {

    private static Logger logger = LoggerFactory.getLogger(No26RemoveDuplicatedFromSortedArray.class);

    public int removeDuplicates(int[] nums) {
        int c = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[c]) {
                nums[++c] = nums[i];
            }
        }

        return c + 1;
    }

    public int removeDuplicates2(int[] nums) {
        int c = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (i == 0) {
                c++;
            }
            else if (nums[i] > nums[c - 1]) {
                nums[c] = nums[i];
                c++;
            }
            else {
                nums[i] = 0;
            }
        }
        return c;
    }

    public int removeDuplicates1(int[] nums) {
        int c = 0;
        int[] changedNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int finalI = i;
            if (nums[finalI] == 0 && (finalI == 0 || finalI > 0 && nums[finalI - 1] < 0)) {
                changedNums[c] = nums[finalI];
                c++;
            }
            else if (Arrays.stream(changedNums).noneMatch(j -> nums[finalI] == j)) {
                changedNums[c] = nums[i];
                c++;
            }
            //logger.info("changedNums[{}]: {}, c: {}", i, changedNums[i], c);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = changedNums[i];
        }
        return c;
    }

}

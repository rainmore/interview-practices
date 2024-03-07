package au.com.rainmore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/">
 *     88. Remove Duplicates from Sorted Array II</a>
 *
 * Time Complexity:O(n)
 * Space Complexity:O(1)
 */
public class No80RemoveDuplicatedFromSortedArray2 {

    private static Logger logger = LoggerFactory.getLogger(No80RemoveDuplicatedFromSortedArray2.class);

    public int removeDuplicates(int[] nums) {
        int c = 0;
        for (final int num: nums) {
            if (c < 2 || num > nums[c - 2]) {
                nums[c++] = num;
            }
        }
        return c;
    }

    public int removeDuplicates1(int[] nums) {
        int c = 0;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer num = nums[i];
            if (!map.containsKey(num)) {
                map.put(num, 1);
            }
            else {
                map.put(num, map.get(num) + 1);
            }
            nums[i] = 0;
        }

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            nums[c] = entry.getKey();
            c++;
            if (entry.getValue() > 1) {
                nums[c] = entry.getKey();
                c++;
            }
        }

        return c;
    }

}

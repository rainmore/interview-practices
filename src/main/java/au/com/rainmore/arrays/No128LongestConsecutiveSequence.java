package au.com.rainmore.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/longest-consecutive-sequence/description/">
 * 128. Longest Consecutive Sequence</a>
 *
 * Time O(n)
 * Space 0 (n)
 */

public class No128LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        int longest = 1;
        for (int n : set) {
            if (!set.contains(n - 1)) {
                int count = 1;
                while(set.contains(n + 1)) {
                    n++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}

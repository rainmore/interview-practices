package au.com.rainmore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/majority-element/?envType=study-plan-v2&envId=top-interview-150">
 *     169. Majority Element</a>
 *
 *
 *
 */
public class No169MajorityElement {

    private Logger logger = LoggerFactory.getLogger(No169MajorityElement.class);

    /**
     * Moore Voting Algorithm
     *
     * Time complexity: O(n)
     * Space complexity: O(2)
     */
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }


    /**
     * Time complexity: O(n log n)
     * Space complexity: O(n log n)
     */
    public int majorityElement2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }

    public int majorityElement1(int[] nums) {
        int n = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (final int i: nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int l = nums.length / 2;
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() > l) {
                n = entry.getKey();
                break;
            }
        }

        return n;
    }

}

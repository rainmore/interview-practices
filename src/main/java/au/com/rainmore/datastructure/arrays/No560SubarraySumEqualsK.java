package au.com.rainmore.datastructure.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/subarray-sum-equals-k/description/">
 * 560. Subarray Sum Equals K</a>
 *
 * Time O(n)
 * Space O(n)
 */
public class No560SubarraySumEqualsK {

    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int res = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int diff = sum - k;
            if (map.containsKey(diff)) {
                res += map.get(diff);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return res;
    }

}

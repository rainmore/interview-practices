package au.com.rainmore.datastructure.arrays;

/**
 * <a href="https://leetcode.com/problems/maximum-sum-circular-subarray/description/">
 * 918. Maximum Sum Circular Subarray</a>
 *
 * Time O(n)
 */
public class No918MaximumSumCircularSubarray {
    public int maxSubarraySumCircular(int[] nums) {

        int currMax = 0;
        int currMin = 0;
        int globalMax = nums[0];
        int globalMin = nums[0];
        int total = 0;

        for (int n: nums) {
            currMax = Math.max(currMax + n, n);
            currMin = Math.min(currMin + n, n);
            total += n;
            globalMax = Math.max(currMax, globalMax);
            globalMin = Math.min(currMin, globalMin);
        }

        return globalMax > 0 ? Math.max(globalMax, total - globalMin) : globalMax;
    }
}

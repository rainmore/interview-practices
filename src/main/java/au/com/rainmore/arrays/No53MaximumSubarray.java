package au.com.rainmore.arrays;


/**
 * <a href="https://leetcode.com/problems/maximum-subarray/description/">
 * 53. Maximum Subarray</a>
 *
 * Time O(n)
 * Space O(1)
 */
public class No53MaximumSubarray {

    public int maxSubArray(int[] nums) {
        if (nums.length == 1) return nums[0];

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int n : nums) {
            sum += n;
            max = Math.max(sum, max);
            if (sum < 0) {
                sum = 0;
            }
        }

        return max;
    }

}

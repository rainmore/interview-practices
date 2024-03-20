package au.com.rainmore.arrays;


/**
 * <a href="https://leetcode.com/problems/find-pivot-index/description/">
 * 724. Find Pivot Index</a>
 * <p>
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class No724FindPivotIndex {

    public int pivotIndex(int[] nums) {

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int rightSum = sum - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }

    public int pivotIndex1(int[] nums) {

        int[] prefix = new int[nums.length + 2];

        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        int rightSum = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            rightSum = rightSum + nums[i];
            if (rightSum == prefix[i + 1]) {
                return i;
            }
        }

        return -1;
    }

}

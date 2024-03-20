package au.com.rainmore.arrays;


/**
 * <a href="https://leetcode.com/problems/range-sum-query-immutable/description/">
 * 303. Range Sum Query - Immutable</a>
 * <p>
 * Time Complexity: O(1)
 * Space Complexity: O(n)
 */
public class No303RangeSumQueryImmutable {

    public static class NumArray {

        private int[] prefix;

        public NumArray(int[] nums) {
            this.prefix = new int[nums.length + 1];
            for (int i = 0; i < nums.length; i++) {
                this.prefix[i + 1] = nums[i] + this.prefix[i];
            }
        }

        public int sumRange(int left, int right) {
            return prefix[right + 1] - prefix[left];
        }
    }

    public static class NumArray1 {

        private int[] nums;
        private int[] prefix;

        public NumArray1(int[] nums) {
            this.nums = nums;
            int sum = 0;
            this.prefix = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                prefix[i] = sum;
            }
        }

        public int sumRange(int left, int right) {
            if (left < 0 || right < 0 || left > right || left > nums.length || right > nums.length) {
                return 0;
            }
            if (right == left) {
                return nums[left];
            }
            int leftSum = (left == 0) ? 0 : prefix[left - 1];
            int rightSum = (right == 0) ? 0 : prefix[right];

            return rightSum - leftSum;
        }
    }

}

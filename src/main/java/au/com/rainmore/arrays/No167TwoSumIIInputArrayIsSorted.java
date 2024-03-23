package au.com.rainmore.arrays;

/**
 * <a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/">
 * 167. Two Sum II - Input Array Is Sorted</a>
 */
public class No167TwoSumIIInputArrayIsSorted {

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while(left < right) {
            if (numbers[left] + numbers[right] == target) {
                break;
            }

            if (numbers[left] + numbers[right] < target) {
                left++;
                continue;
            }

            right--;
        }

        return new int[]{left + 1, right + 1};
    }
}

package au.com.rainmore.extra;

/**
 * <a href="https://leetcode.com/problems/binary-search/">
 *     704. Binary Search</a>
 *
 * Time Complexity:O(log n)
 * Space Complexity:O(1)
 */
public class No704BinarySearch {

    public int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int m =  1 + ((r - l) / 2);

            if (target > nums[m]) {
                l = m + 1;
            }
            else if (target < nums[m]){
                r = m - 1;
            }
            else {
                return m;
            }
        }
        return -1;
    }

}

package au.com.rainmore.arrays;


import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/description/">
 * 1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold</a>
 *
 * Time: O(n)
 * Space: O(k)
 */
public class No1343NumberOfSubArraysOfSizeKAndAverageGreaterThanOrEqualToThreshold {


    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int subsum = 0;

        for (int i = 0 ; i < k - 1; i++) {
            subsum += arr[i];
        }

        for (int i = 0; i < (arr.length - k + 1); i++) {
            subsum += arr[i + k - 1];
            if ((subsum / k) >= threshold) {
                count++;
            }
            subsum -= arr[i];
        }


        return count;
    }

}

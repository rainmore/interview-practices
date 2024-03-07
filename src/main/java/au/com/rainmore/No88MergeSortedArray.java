package au.com.rainmore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150">
 *     88. Merge Sorted Array</a>
 *
 *
 *
 */
public class No88MergeSortedArray {

    private Logger logger = LoggerFactory.getLogger(No88MergeSortedArray.class);


    /**
     * Time complexity: O(m+n)
     * Space complexity: O(1)
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            }
            else {
                nums1[k--] = nums2[j--];
            }
        }
    }

    /**
     * Time complexity: O((m+n)log(m+n))
     * Space complexity: O(1)
     */
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0, j = m; i < n; i++) {
            nums1[j++] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;

        for (int i = m + n - 1; i >= 0; i--) {
            logger.info("Before p1: {}, p2: {}, p: {}", p1, p2, i);
            if (p2 < 0) {
                break;
            }
            logger.info("Before nums1[{}]: {}, nums2[{}]: {}", p1, nums1[p1], p2, nums2[p2]);

            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[i] = nums1[p1--];
            }
            else {
                nums1[i] = nums2[p2--];
            }

            logger.info("Before p1: {}, p2: {}, p: {}", p1, p2, i);
            if (p2 >= 0) {
                logger.info("After nums1[{}]: {}, nums2[{}]: {}", p1, nums1[p1], p2, nums2[p2]);
            }

        }
    }

}

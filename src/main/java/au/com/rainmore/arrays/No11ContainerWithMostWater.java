package au.com.rainmore.arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/container-with-most-water/description/">
 * 11. Container With Most Water</a>
 */
public class No11ContainerWithMostWater {

    private Logger logger = LoggerFactory.getLogger(No11ContainerWithMostWater.class);

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public int maxArea(int[] height) {
        int result = 0;
        int left = 0;
        int right = height.length - 1;

        while(left < right) {
            int width = right - left;
            int area = width * Math.min(height[left], height[right]);
            result = Math.max(area, result);

            if (height[left] < height[right]) {
                left++;
            }
            else {
                right--;
            }
        }


        return result;
    }

}

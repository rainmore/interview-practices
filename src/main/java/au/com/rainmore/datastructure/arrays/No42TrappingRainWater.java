package au.com.rainmore.datastructure.arrays;


/**
 * <a href="https://leetcode.com/problems/trapping-rain-water/description/">
 * 42. Trapping Rain Water</a>
 * Time O (n)
 */
public class No42TrappingRainWater {

    /**
     * Time O(n)
     * Space O(1)
     */
    public int trap(int[] height) {
        if (height.length == 0) return 0;

        int result = 0;
        int l = 0;
        int r = height.length - 1;

        int lMax = height[l];
        int rMax = height[r];

        while (l < r) {
            if (lMax < rMax) {
                l++;
                lMax = Math.max(lMax, height[l]);
                result += lMax - height[l];
            }
            else {
                r--;
                rMax = Math.max(rMax, height[r]);
                result += rMax - height[r];
            }
        }

        return result;
    }

    public int trap1(int[] height) {
        int sum = 0;
        int[] prefix = new int[height.length];
        int[] suffix = new int[height.length];
        int left = height[0];
        int right = height[height.length - 1];

        for (int i = 0 ; i < height.length; i++) {
            prefix[i] = Math.max(left, height[i]);
            left = prefix[i];

            int rightIdx =  height.length - 1 - i;
            suffix[rightIdx] = Math.max(right, height[rightIdx]);
            right = suffix[rightIdx];
        }

        for (int i = 0; i < height.length; i++) {
            sum = sum + Math.min(prefix[i], suffix[i]) - height[i];
        }

        return sum;
    }

}

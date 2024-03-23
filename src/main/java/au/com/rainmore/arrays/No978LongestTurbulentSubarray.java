package au.com.rainmore.arrays;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <a href="https://leetcode.com/problems/longest-turbulent-subarray/description/">
 * 978. Longest Turbulent Subarray</a>
 * <p>
 * Time Complexity:O(n)
 * Space Complexity:O(1)
 */
public class No978LongestTurbulentSubarray {

    private Logger logger = LoggerFactory.getLogger(No978LongestTurbulentSubarray.class);

    public int maxTurbulenceSize(int[] arr) {
        int left = 0;
        int right = left + 1;

        int result = 1;
        char previous = '=';

        while (right < arr.length) {
            if (arr[right - 1] > arr[right] && previous != '>') {
                result = Math.max(result, right - left + 1);
                right++;
                previous = '>';
            }
            else if (arr[right - 1] < arr[right] && previous != '<') {
                result = Math.max(result, right - left + 1);
                right++;
                previous = '<';
            }
            else {
                right = (arr[right - 1] == arr[right]) ? right + 1 : right;
                left = right - 1;
                previous = '=';
            }
        }

        return result;
    }

}

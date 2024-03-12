package au.com.rainmore.arrays;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * <a href="https://leetcode.com/problems/k-closest-points-to-origin/description/">
 * 973. K Closest Points to Origin</a>
 * <p>
 * Time Complexity:O(log n)
 * Space Complexity:O(1)
 */
public class No973KClosestPointsToOrigin {

    private Logger logger = LoggerFactory.getLogger(No973KClosestPointsToOrigin.class);

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
                Comparator.comparingInt(a -> (a[0] * a[0] + a[1] * a[1]))
        );

        for (int[] i : points) {
            minHeap.offer(i);
        }
        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            int[] tmp = minHeap.poll();
            result[i][0] = tmp[0];
            result[i][1] = tmp[1];
        }

        return result;
    }

}

package au.com.rainmore.datastructure.stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Stream;

/**
 * <a href="https://leetcode.com/problems/car-fleet/description/">
 * 853. Car Fleet</a>
 */
public class No853CarFleet {

    private Logger logger = LoggerFactory.getLogger(No853CarFleet.class);

    public int carFleet(int target, int[] position, int[] speed) {
        int length = position.length;
        int[][] ps = new int[length][2];

        for (int i = 0; i < length; i++) {
            ps[i] = new int[]{position[i], speed[i]};
        }

        Arrays.sort(ps, (a, b) -> b[0] - a[0]);
        int fleets = 1;
        int[] stack = ps[0];

        for (int i = 1; i < length; i++) {
            double d1 = ((double) target - stack[0]) / stack[1];
            double d2 = ((double) target - ps[i][0]) / ps[i][1];

            if (d2 > d1) {
                fleets++;
                stack = ps[i];
            }
        }

        return fleets;
    }

    public int carFleet1(int target, int[] position, int[] speed) {
        Stack<Integer> stack = new Stack<>();

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < position.length; i++) {
            map.put(position[i], speed[i]);
        }

        Arrays.sort(position);
        Map<Integer, Integer> map2 = new LinkedHashMap<>();
        for (int i = position.length - 1; i >=0; i--) {
            map2.put(position[i], map.get(position[i]));
        }

        for (Map.Entry<Integer, Integer> entry : map2.entrySet()) {
            double key = (target * 1.0 - entry.getKey()) / entry.getValue();
            stack.push((int) Math.ceil(key));
            int stackSize = stack.size();
            if (stackSize >= 2 && stack.get(stackSize - 1) <= stack.get(stackSize -2)) {
                stack.pop();
            }
        }

        return stack.size();
    }

}

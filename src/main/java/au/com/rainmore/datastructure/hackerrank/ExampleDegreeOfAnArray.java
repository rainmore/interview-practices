package au.com.rainmore.datastructure.hackerrank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExampleDegreeOfAnArray {

    public int degreeOfArray(List<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int l = arr.size();
        int min = 0;
        for (Integer num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int max = map.values().stream().mapToInt(v -> v)
                .max().orElse(1);
        return Math.min(max, l);
    }


    public int lala(List<Integer> arr) {
        Map<Integer, int[]> map = new HashMap<>();
        int max = 0;
        int res = 0;
        for (int i = 0; i < arr.size(); i++) {
            int current = arr.get(i);
            if (!map.containsKey(current)) {
                map.put(current, new int[]{i, i, 1});
                if (max == 0) max = 1;
                if (res == 0) res = 1;
            } else {
                int[] x = map.get(current);
                x[1] = i;
                x[2]++;
                if (x[2] > max) {
                    max = x[2];
                    res = i - x[0] + 1;
                } else if (x[2] == max) {
                    res = Math.min(res, i - x[0] + 1);
                }
            }
        }
        return res;
    }
}

package au.com.rainmore.datastructure.hackerrank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question1 {

    public List<Integer> getStaleServerCount(
            int n,
            List<List<Integer>> log_data,
            List<Integer> query,
            int X) {
        List<Integer> results = new ArrayList<>();

        for (int q : query) {
            int max = q;
            int min = ((q - X) >= 0) ? q -X : 0 ;
            Set<Integer> count = new HashSet<>();

            for (int i = 0; i < log_data.size(); i++) {
                int id = log_data.get(i).get(0);
                int time = log_data.get(i).get(1);
                if (time <= max && time >= min) {
                    count.add(id);
                }
            }

            results.add(n - count.size());
        }

        return results;
    }
}

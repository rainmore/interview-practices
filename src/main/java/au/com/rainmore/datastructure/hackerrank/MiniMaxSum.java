package au.com.rainmore.datastructure.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MiniMaxSum {


    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long min = 0;
        long max = 0;


        List<Integer> sortedList = arr.stream().sorted().collect(Collectors.toList());

        for (int i = 0; i < sortedList.size(); i++) {
            if (i < sortedList.size() - 1) {
                min += sortedList.get(i);
            }
            if (i > 0) {
                max += sortedList.get(i);
            }
        }

//        int size = arr.size();
//        int[] a = new int[size];
//        Arrays.setAll(a, arr::get);
//        Arrays.sort(a);
//
//        for (int i = 0; i < size; i++) {
//            if (i < size - 1) {
//                min += a[i];
//            }
//            if (i > 0) {
//                max += a[i];
//            }
//        }

        System.out.println(min + " " + max);
    }


}

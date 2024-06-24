package au.com.rainmore.datastructure.hackerrank;

import java.util.List;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int cP = 0;
        int cN = 0;
        int cZ = 0;
        int total = arr.size();
        for (Integer num: arr) {
            if (num > 0) cP++;
            else if (num < 0) cN++;
            else cZ++;
        }

        print(cP, total);
        print(cN, total);
        print(cZ, total);

    }

    private static void print(int count, int total) {
        float r = ((float) count) / total;
        System.out.println(String.format("%.6f", r));

    }

}

package au.com.rainmore.java;

import java.util.Arrays;
import java.util.HashMap;

public class SmallestNumberInArray {

    public int solution(int[] A) {
        Arrays.sort(A);

        int result = 1;
        for (int i = 0; i < A.length; i++) {
            if (result < A[i]) {
                return result;
            }
            result = A[i] + 1;
        }

        return Math.max(result, 1);

    }


    public void test() {
//        String value = "red";
//        switch (value) {
//            case "red":
//                System.out.println("FAIL");
//            case "red":
//                System.out.println("FAIL");
//        }

    }
}

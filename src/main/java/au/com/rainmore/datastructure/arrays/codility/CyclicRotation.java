package au.com.rainmore.datastructure.arrays.codility;

public class CyclicRotation {

    public int[] solution(int[] A, int K) {
        if (A == null || A.length == 0) {
            return new int[]{};
        }
        int actualK = K % A.length;
        if (actualK == 0) {
            return A;
        }
        int[] result = new int[A.length];

        int idx = actualK;
        for (int j : A) {
            result[idx] = j;
            idx++;
            if (idx >= A.length) {
                idx = 0;
            }
        }

        return result;
    }

}

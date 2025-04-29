package au.com.rainmore.datastructure.arrays.codility;

public class BinaryGap {

    public int solution(int N) {
        String binary = Integer.toBinaryString(N);
        int max = 0;
        int gap = 0;
        int counter = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                counter++;
                if (counter % 2 == 0) {
                    if (gap > max) {
                        max = gap;
                    }

                    counter--;
                    gap = 0;
                }
            }
            if (counter > 0 && binary.charAt(i) == '0') {
                gap++;
            }
        }
        return max;
    }
}

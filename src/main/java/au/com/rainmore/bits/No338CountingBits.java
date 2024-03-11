package au.com.rainmore.bits;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <a href="https://leetcode.com/problems/counting-bits/">
 * 338. Counting Bits</a>
 */
public class No338CountingBits {

    private Logger logger = LoggerFactory.getLogger(No338CountingBits.class);

    public int[] countBits(int n) {
        int[] r = new int[n + 1];
        int offset = 1;
        for (int i = 1; i < r.length; i++) {
            if (offset * 2 == i) {
                offset = i;
            }
            r[i] = 1 + r[i - offset];
        }
        return r;
    }


    public int[] countBits1(int n) {
        int[] r = new int[n + 1];
        for (int i = 0; i < r.length; i++) {
            r[i] = count(i);
        }
        return r;
    }

    private int count(int n) {
        int c = 0;
        while(n > 0) {
            c += n % 2;
            n >>>= 1;
        }
        return c;
    }
}

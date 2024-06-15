package au.com.rainmore.datastructure.bits;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <a href="https://leetcode.com/problems/number-of-1-bits/">
 * 191. Number of 1 Bits</a>
 */
public class No191NumberOf1Bits {

    private Logger logger = LoggerFactory.getLogger(No191NumberOf1Bits.class);

    public int hammingWeight(long n) {
        int c = 0;
        logger.info("{}", n);
        while (n > 0) {
            c += n & 1;
            n = n >>> 1;
        }
        return c;
    }

}

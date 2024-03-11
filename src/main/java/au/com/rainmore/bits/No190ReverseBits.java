package au.com.rainmore.bits;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <a href="https://leetcode.com/problems/reverse-bits/">
 * 190. Reverse Bits</a>
 */
public class No190ReverseBits {

    private Logger logger = LoggerFactory.getLogger(No190ReverseBits.class);

    public int reverseBits(int n) {
        int data = 0;
        for (int i = 0; i < 32; i++) {
            int bit = (n >> i) & 1;
            data = data | bit << (31 - i);
        }
        return data;
    }

}

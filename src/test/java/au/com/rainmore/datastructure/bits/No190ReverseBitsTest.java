package au.com.rainmore.datastructure.bits;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class No190ReverseBitsTest {

    private No190ReverseBits test = new No190ReverseBits();

    @Test
    void test1() {
        long data = new BigInteger("00000010100101000001111010011100", 2).longValue();
    }


    @Test
    void test2() {
        long data = new BigInteger("11111111111111111111111111111101", 2).longValue();
    }

    @Test
    void test3() {

    }
}

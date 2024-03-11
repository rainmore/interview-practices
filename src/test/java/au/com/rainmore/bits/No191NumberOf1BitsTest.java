package au.com.rainmore.bits;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

class No191NumberOf1BitsTest {

    private No191NumberOf1Bits test = new No191NumberOf1Bits();


    @Test
    void test1() {
        long data = new BigInteger("00000000000000000000000000001011", 2).longValue();

        assertEquals(3, test.hammingWeight(data));
    }

    @Test
    void test2() {
        long data = new BigInteger("00000000000000000000000010000000", 2).longValue();
        assertEquals(1, test.hammingWeight(data));
    }

    @Test
    void test3() {
        long data = new BigInteger("11111111111111111111111111111101", 2).longValue();
        assertEquals(31, test.hammingWeight(data));
    }

}

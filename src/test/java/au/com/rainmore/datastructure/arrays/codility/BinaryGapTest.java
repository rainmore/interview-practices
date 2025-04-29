package au.com.rainmore.datastructure.arrays.codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryGapTest {
    private BinaryGap binaryGap;

    @BeforeEach
    void setUp() {
        binaryGap = new BinaryGap();
    }

    @Test
    void solution() {
        assertEquals(2, binaryGap.solution(9));
        assertEquals(4, binaryGap.solution(529));
        assertEquals(0, binaryGap.solution(15));
        assertEquals(0, binaryGap.solution(32));
        assertEquals(5, binaryGap.solution(1041));
        assertEquals(2, binaryGap.solution(328));
        assertEquals(3, binaryGap.solution(1162));
        assertEquals(2, binaryGap.solution(51712));
        assertEquals(9, binaryGap.solution(66561));
        assertEquals(9, binaryGap.solution(66561));
        assertEquals(20, binaryGap.solution(6291457));
        assertEquals(25, binaryGap.solution(805306373));
        assertEquals(28, binaryGap.solution(1610612737));
    }

}

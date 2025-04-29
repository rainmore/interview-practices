package au.com.rainmore.datastructure.arrays.codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CyclicRotationTest {

    private CyclicRotation cyclicRotation;

    @BeforeEach
    void setUp() {
        cyclicRotation = new CyclicRotation();
    }

    @Test
    void solution() {
        assertArrayEquals(new int[]{}, cyclicRotation.solution(new int[]{}, 0));
        assertArrayEquals(new int[]{9, 7, 6, 3, 8}, cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 3));
        assertArrayEquals(new int[]{9, 7, 6, 3, 8}, cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 8));
        assertArrayEquals(new int[]{0, 0, 0}, cyclicRotation.solution(new int[]{0, 0, 0}, 1));
        assertArrayEquals(new int[]{1, 2, 3, 4}, cyclicRotation.solution(new int[]{1, 2, 3, 4}, 4));
    }
}

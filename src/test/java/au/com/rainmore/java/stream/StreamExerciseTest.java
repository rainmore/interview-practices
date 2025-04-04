package au.com.rainmore.java.stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StreamExerciseTest {

    private StreamExercise streamExercise = null;

    @BeforeEach
    void setup() {
        streamExercise = new StreamExercise();
    }

    @Test
    void testIntSorted() {
        int[] data = new int[]{14, 12, 17, 2, 7, 11, 15};

        int[] result = streamExercise.intSorted(data);

        assertArrayEquals(new int[]{2, 7, 11, 12,14, 15, 17}, result);
    }

    @Test
    void testIntReversedSorted() {
        int[] data = new int[]{14, 12, 17, 2, 7, 11, 15};

        int[] result = streamExercise.intReversedSorted(data);

        assertArrayEquals(new int[]{17, 15, 14, 12, 11, 7, 2}, result);
    }

    @Test
    void testStreamToMap() {
        int[] data = new int[]{12, 17, 2, 7};

        Map<Integer, String> result = streamExercise.streamToMap(data);
        Map<Integer, String> expected = Map.of(
                12, "12",
                17, "17",
                2, "2",
                7, "7");

        assertEquals(expected.size(), result.size());
        for (Map.Entry<Integer, String> entry : expected.entrySet()) {
            assertEquals(entry.getValue(), result.get(entry.getKey()) );
        }
    }

    @Test
    void testStreamToLinkedMap() {
        int[] data = new int[]{12, 17, 2, 7};

        Map<Integer, String> result = streamExercise.streamToLinkedMap(data);
        Map<Integer, String> expected = new LinkedHashMap<>();
        expected.put(12, "12");
        expected.put(17, "17");
        expected.put(2, "2");
        expected.put(7, "7");

        assertEquals(expected.size(), result.size());
        for (Map.Entry<Integer, String> entry : expected.entrySet()) {
            assertEquals(entry.getValue(), result.get(entry.getKey()) );
        }
    }

}

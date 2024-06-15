package au.com.rainmore.datastructure.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class No739DailyTemperaturesTest {

    private No739DailyTemperatures test = new No739DailyTemperatures();

    @Test
    void test1() {
        int[] data = new int[]{73,74,75,71,69,72,76,73};
        int[] result = test.dailyTemperatures(data);

        int[] expected = new int[]{1,1,4,2,1,1,0,0};

        assertArrayEquals(expected, result);
    }

    @Test
    void test2() {
        int[] data = new int[]{30,40,50,60};
        int[] result = test.dailyTemperatures(data);

        int[] expected = new int[]{1,1,1,0};

        assertArrayEquals(expected, result);
    }

    @Test
    void test3() {
        int[] data = new int[]{30,60,90};
        int[] result = test.dailyTemperatures(data);

        int[] expected = new int[]{1,1,0};

        assertArrayEquals(expected, result);
    }

}

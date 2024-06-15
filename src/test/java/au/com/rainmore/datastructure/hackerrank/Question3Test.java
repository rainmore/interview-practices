package au.com.rainmore.datastructure.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class Question3Test {

    private Question3 test = new Question3();

    @Test
    void test1() {
        List<Integer> time = List.of(0, 0, 1,5);
        List<Integer> direction = List.of(0, 1, 1, 0);
        List<Integer> result = test.getTimes(time,direction);

        assertIterableEquals(List.of(2,0,1,5), result);
    }

}

package au.com.rainmore.datastructure.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleDegreeOfAnArrayTest {

    private ExampleDegreeOfAnArray test = new ExampleDegreeOfAnArray();

    @Test
    void test1() {
        List<Integer> data = List.of(1,2,2,3,1);
        int r = test.degreeOfArray(data);

        assertEquals(2, r);

    }

    @Test
    void test2() {
        List<Integer> data = List.of(6,1,1,2,1,2,2);
        int r = test.degreeOfArray(data);

        assertEquals(4, r);

    }

}

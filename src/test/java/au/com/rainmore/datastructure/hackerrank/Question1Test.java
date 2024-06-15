package au.com.rainmore.datastructure.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class Question1Test {


    private Question1 test = new Question1();

    @Test
    void test1() {
        int n = 3;
        int X = 5;
        List<List<Integer>> log = List.of(
                List.of(1,3),
                List.of(2,6),
                List.of(1,5));
        List<Integer> query = List.of(10, 11);

        List<Integer> r = test.getStaleServerCount(n,log,query, X);

        assertIterableEquals(List.of(1,2), r);
    }

    @Test
    void test2() {
        int n = 6;
        int X = 2;
        List<List<Integer>> log = List.of(
                List.of(3,2),
                List.of(4,3),
                List.of(2,6),
                List.of(6,3));
        List<Integer> query = List.of(3,2,6);

        List<Integer> r = test.getStaleServerCount(n,log,query, X);

        assertIterableEquals(List.of(3,5,5), r);
    }

    @Test
    void test3() {
        int n = 6;
        int X = 1;
        List<List<Integer>> log = List.of(
                List.of(3,2),
                List.of(4,3),
                List.of(2,6),
                List.of(6,3));
        List<Integer> query = List.of(1,2,3,4,5,6);

        List<Integer> r = test.getStaleServerCount(n,log,query, X);

        assertIterableEquals(List.of(6,5,3,4,6,5), r);
    }

    @Test
    void test4() {
        int n = 4;
        int X = 5;
        List<List<Integer>> log = List.of(
                List.of(1,3),
                List.of(2,6),
                List.of(1,5),
                List.of(3,4));
//        List<Integer> query = List.of(10,6);
        List<Integer> query = List.of(10,6);
        List<Integer> r = test.getStaleServerCount(n,log,query, X);

        assertIterableEquals(List.of(2,1), r);
    }

}

package au.com.rainmore.datastructure.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class No150EvaluateReversePolishNotationTest {

    private No150EvaluateReversePolishNotation test = new No150EvaluateReversePolishNotation();

    @Test
    void test1() {
        String[] tokens = new String[]{"2","1","+","3","*"};
        int r = test.evalRPN(tokens);

        assertEquals(9, r);
    }

    @Test
    void test2() {
        String[] tokens = new String[]{"4","13","5","/","+"};
        int r = test.evalRPN(tokens);

        assertEquals(6, r);
    }

    @Test
    void test3() {
        String[] tokens = new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        int r = test.evalRPN(tokens);

        assertEquals(22, r);
    }

}

package au.com.rainmore.datastructure.stack;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class No22GenerateParenthesesTest {

    private No22GenerateParentheses test = new No22GenerateParentheses();

    @Test
    void test1() {
        int input = 3;
        List<String> result = test.generateParenthesis(input);
        List<String> expected = List.of("((()))","(()())","(())()","()(())","()()()");
        assertIterableEquals(expected, result);
    }

    @Test
    void test2() {
        int input = 1;
        List<String> result = test.generateParenthesis(input);
        List<String> expected = List.of("()");
        assertIterableEquals(expected, result);
    }

}

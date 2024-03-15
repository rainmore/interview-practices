package au.com.rainmore.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class WrapLinesTest {

    private WrapLines test = new WrapLines();

    String[] words1 = {"The", "day", "began", "as", "still", "as", "the", "night", "abruptly", "lighted", "with", "brilliant", "flame"};
    String[] words2 = {"Hello"};
    String[] words3 = {"Hello", "Hello"};
    String[] words4 = {"Well", "Hello", "world"};

    @Test
    void test1() {
        String[] words = {"a", "b", "c", "d"};

        List<String> result = test.wrapLines(words, 1);

        assertIterableEquals(List.of("a", "b", "c", "d"), result);
    }

    @Test
    void test2() {
        String[] words = {"Hello", "HelloWorld", "Hello", "Hello"};

        List<String> result = test.wrapLines(words, 10);

        assertIterableEquals(List.of("Hello", "HelloWorld", "Hello", "Hello"), result);
    }


    @Test
    void test3() {
        String[] words = {"Hello", "HelloWorld", "Hello", "Hello"};

        List<String> result = test.wrapLines(words, 11);

        assertIterableEquals(List.of("Hello", "HelloWorld", "Hello-Hello"), result);
    }

    @Test
    void test4() {
        String[] words = {"Hello", "HelloWorld", "Hello", "Hello"};

        List<String> result = test.wrapLines(words, 12);

        assertIterableEquals(List.of("Hello", "HelloWorld", "Hello-Hello"), result);
    }

    @Test
    void test5() {
        String[] words = {"Hello", "HelloWorld", "Hello", "Hello"};

        List<String> result = test.wrapLines(words, 15);

        assertIterableEquals(List.of("Hello", "HelloWorld", "Hello-Hello"), result);
    }

    @Test
    void test6() {
        String[] words = {"Hello", "HelloWorld", "Hello", "Hello"};

        List<String> result = test.wrapLines(words, 16);

        assertIterableEquals(List.of("Hello-HelloWorld", "Hello-Hello"), result);
    }



}

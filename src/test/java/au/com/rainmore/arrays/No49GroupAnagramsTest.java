package au.com.rainmore.arrays;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class No49GroupAnagramsTest {

    private No49GroupAnagrams test = new No49GroupAnagrams();

    @Test
    void test1() {
        String[] s = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> expected = List.of(
                List.of("bat"),
                List.of("tan", "nat"),
                List.of("eat","tea","ate"));
        List<List<String>> r = test.groupAnagrams(s);

        assertEquals(expected.size(), r.size());
        for (int i = 0; i< expected.size(); i++) {
            assertIterableEquals(expected.get(i), r.get(i));
        }
    }

    @Test
    void test2() {
        String[] s = {""};

        List<List<String>> expected = List.of(List.of(""));
        List<List<String>> r = test.groupAnagrams(s);

        assertEquals(expected.size(), r.size());
        for (int i = 0; i< expected.size(); i++) {
            assertIterableEquals(expected.get(i), r.get(i));
        }
    }

    @Test
    void test3() {
        String[] s = {"a"};

        List<List<String>> expected = List.of(List.of("a"));
        List<List<String>> r = test.groupAnagrams(s);

        assertEquals(expected.size(), r.size());
        for (int i = 0; i< expected.size(); i++) {
            assertIterableEquals(expected.get(i), r.get(i));
        }
    }


}

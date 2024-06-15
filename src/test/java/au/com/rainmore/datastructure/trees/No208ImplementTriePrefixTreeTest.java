package au.com.rainmore.datastructure.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class No208ImplementTriePrefixTreeTest {

    private No208ImplementTriePrefixTree test;

    @Test
    void test1() {
        test = new No208ImplementTriePrefixTree();

        test.insert("apple");

        assertTrue(test.search("apple"));
        assertFalse(test.search("app"));
        assertTrue(test.startsWith("app"));
        test.insert("app");
        assertTrue(test.search("app"));
    }

}

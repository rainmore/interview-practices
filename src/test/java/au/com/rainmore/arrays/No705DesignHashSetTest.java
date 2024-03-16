package au.com.rainmore.arrays;

import org.junit.jupiter.api.Test;

import au.com.rainmore.arrays.No705DesignHashSet.MyHashSet;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class No705DesignHashSetTest {

    @Test
    void test1() {
        MyHashSet set = new MyHashSet();

        set.add(1);
        set.add(2);
        assertTrue(set.contains(1));
        assertFalse(set.contains(3));

        set.add(2);
        assertTrue(set.contains(2));

        set.remove(2);
        assertFalse(set.contains(2));
    }

}

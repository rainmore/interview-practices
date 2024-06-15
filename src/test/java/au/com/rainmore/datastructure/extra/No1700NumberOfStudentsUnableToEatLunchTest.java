package au.com.rainmore.datastructure.extra;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class No1700NumberOfStudentsUnableToEatLunchTest {

    private No1700NumberOfStudentsUnableToEatLunch test = new No1700NumberOfStudentsUnableToEatLunch();

    @Test
    void test1() {
        int[] st = new int[]{1,1,0,0};
        int[] sw = new int[]{0,1,0,1};

        assertEquals(0, test.countStudents(st, sw));
    }


    @Test
    void test2() {
        int[] st = new int[]{1,1,1,0,0,1};
        int[] sw = new int[]{1,0,0,0,1,1};

        assertEquals(3, test.countStudents(st, sw));
    }


}

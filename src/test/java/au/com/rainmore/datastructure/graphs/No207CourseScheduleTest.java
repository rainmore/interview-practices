package au.com.rainmore.datastructure.graphs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class No207CourseScheduleTest {

    private No207CourseSchedule test = new No207CourseSchedule();

    @Test
    void test1() {
        int numCourses = 2;
        int[][] prerequisites = {{1,0}};

        boolean result = test.canFinish(2, prerequisites);

        assertTrue(result);
    }

    @Test
    void test2() {
        int numCourses = 2;
        int[][] prerequisites = {{1,0}, {0,1}};

        boolean result = test.canFinish(2, prerequisites);

        assertFalse(result);
    }

}

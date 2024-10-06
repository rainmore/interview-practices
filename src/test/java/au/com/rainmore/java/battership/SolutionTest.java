package au.com.rainmore.java.battership;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test_solution_count_PatrolBoat_0() {
        String[] b1 = {"...", ".#.", "..."};

        int[] result1 = solution.solution(b1);
        assertArrayEquals(new int[]{1, 0, 0}, result1);
    }

    @Test
    void test_solution_count_PatrolBoat_1() {
        String[] b1 = {".##.#", "#.#..", "#...#", "#.##."};
        int[] result1 = solution.solution(b1); // 2, 1, 2
        assertArrayEquals(new int[]{2, 1, 2}, result1);
    }

    @Test
    void test_solution_count_PatrolBoat_2() {
        String[] b2 = {".#..#", "##..#", "...#."};
        int[] result2 = solution.solution(b2); // 2, 1, 2
        assertArrayEquals(new int[]{1, 1, 1}, result2);

    }

    @Test
    void test_solution_count_PatrolBoat_3() {
        String[] b3 = {"##.", "#.#", ".##"};
        int[] result3 = solution.solution(b3); // 0, 0, 2
        assertArrayEquals(new int[]{0, 0, 2}, result3);
    }

    @Test
    void test_solution_count_PatrolBoat_4() {
        String[] b4 = {"...", "...", "..."};
        int[] result4 = solution.solution(b4); // 0, 0, 0
        assertArrayEquals(new int[]{0, 0, 0}, result4);
    }

}

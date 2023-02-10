import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void solution() {
        Solution solution = new Solution();

        assertEquals(1, solution.solution(new int[]{2, 1, 3, 2}, 2));
        assertEquals(5, solution.solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
    }
}
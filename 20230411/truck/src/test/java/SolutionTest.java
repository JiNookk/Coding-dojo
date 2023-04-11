import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void solution() {
        assertEquals(8, solution.solution(2, 10, new int[]{7, 4, 5, 6}));
        assertEquals(101, solution.solution(100, 100, new int[]{10}));
        assertEquals(110, solution.solution(100, 100, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}));
    }
}

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
        assertEquals(5, solution.solution(new int[]{1, 1, 1, 1, 1}, 3));
        assertEquals(2, solution.solution(new int[]{4, 1, 2, 1}, 4));
    }
}

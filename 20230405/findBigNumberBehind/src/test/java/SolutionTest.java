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
        assertArrayEquals(new int[]{3, 5, 5, -1}, solution.solution(new int[]{2, 3, 3, 5}));
        assertArrayEquals(new int[]{-1, 5, 6, 6, -1, -1}, solution.solution(new int[]{9, 1, 5, 3, 6, 2}));
    }
}

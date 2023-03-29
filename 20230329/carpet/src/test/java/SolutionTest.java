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
        assertArrayEquals(new int[]{4, 3}, solution.solution(10, 2));
        assertArrayEquals(new int[]{3, 3}, solution.solution(8, 1));
        assertArrayEquals(new int[]{8, 6}, solution.solution(24, 24));
    }
}

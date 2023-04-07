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
        assertArrayEquals(new int[]{4, 3, 1, 1, 0}, solution.solution(new int[]{1, 2, 3, 2, 3}));
    }
}
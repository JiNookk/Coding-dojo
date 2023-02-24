import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void solution() {
        Solution solution = new Solution();

        assertEquals(19, solution.solution(2, 1, 20));
        assertEquals(9, solution.solution(3, 1, 20));
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void solution() {
        Solution solution = new Solution();

//        assertEquals(8, solution.solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1}));
        assertEquals(33, solution.solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}));
    }
}
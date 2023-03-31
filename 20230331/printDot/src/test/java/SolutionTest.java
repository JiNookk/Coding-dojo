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
        assertEquals(3, solution.solution(1, 1));
        assertEquals(1, solution.solution(5, 1));
        assertEquals(6, solution.solution(2, 4));
        assertEquals(26, solution.solution(1, 5));
        assertEquals(26, solution.solution(1, 1000000));
    }

//    @Test
//    void getMaxMultiplier() {
//        assertEquals(2, solution.getMaxMultiplier(2, 4));
//        assertEquals(5, solution.getMaxMultiplier(1, 5));
//    }
}
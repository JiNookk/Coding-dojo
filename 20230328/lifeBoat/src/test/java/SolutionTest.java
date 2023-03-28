import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// 정렬을 한다.
// 보트 카운트를 리턴한다.

class SolutionTest {
    Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void solution() {
        assertEquals(3, solution.solution(new int[]{70, 50, 80, 50}, 100));
        assertEquals(3, solution.solution(new int[]{70, 80, 50}, 100));
    }
}
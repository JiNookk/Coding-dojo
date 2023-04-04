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
        assertEquals("6210", solution.solution(new int[]{6, 10, 2}));
        assertEquals("9534330", solution.solution(new int[]{3, 30, 34, 5, 9}));
        assertEquals("700000", solution.solution(new int[]{70, 0, 0, 0, 0}));
        assertEquals("21221", solution.solution(new int[]{212, 21}));
        assertEquals("23232", solution.solution(new int[]{232, 23}));
        assertEquals("0", solution.solution(new int[]{0, 0, 0, 0}));
    }

    // 비교 (compareTo) -> 앞자리부터 비교 -> 크면 리턴, 같다면? -> 뒷자리 비교
    // 만약 3과 30을 비교하게 되면? -> 3이 먼저와야함.
    // 만약 3과 34를 비교하게 되면? -> 34가 먼저와야함.
//    @Test
//    void compare() {
//        assertTrue(solution.compare(34, 30) > 0);
//        assertTrue(solution.compare(9, 30) > 0);
//        assertTrue(solution.compare(3, 30) > 0);
//    }
}
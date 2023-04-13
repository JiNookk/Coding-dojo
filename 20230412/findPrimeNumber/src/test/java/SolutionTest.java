import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//- 문자열을 각각 분리한다.
//- 소수인지 판별하는 메서드 -> 1부터 자신까지 나눈다. -> 개수가 2 이상일 경우 false
//- 맨앞의 0을 모두 없애는 메서드
//- dfs를 이용해 이어붙일 수 있는 모든 경우를 만든다. -> 모든 경우 앞 0을 벗겨낸다.
//- set에 집어넣는다.

class SolutionTest {
    Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void isPrimeNumber() {
        assertTrue(solution.isPrimeNumber("17"));
        assertTrue(solution.isPrimeNumber("2"));
        assertFalse(solution.isPrimeNumber("6"));
        assertFalse(solution.isPrimeNumber("0"));
    }

    @Test
    void trimLeadingZero() {
        assertEquals("14", solution.trimLeadingZero("0014"));
        assertEquals("0", solution.trimLeadingZero("0"));
    }

    @Test
    void solution() {
        assertEquals(3, solution.solution("17"));
    }

    @Test
    void solution2() {
        assertEquals(2, solution.solution("011"));
    }

    @Test
    void solution3() {
        assertEquals(18, solution.solution("1231"));
    }

    @Test
    void solution4() {
        assertEquals(6, solution.solution("143"));
    }
}
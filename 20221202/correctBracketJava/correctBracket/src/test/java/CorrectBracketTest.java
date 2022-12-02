import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//        - 앞에서 부터 (와 )의 카운트를 센다.
//        - (의 개수보다 )의 개수가 커지면 올바르지 않은 괄호이다.
//        - (와 )의 개수가 다르면 올바르지 않은 괄호이다.

class CorrectBracketTest {
    CorrectBracket correctBracket;

    @BeforeEach
    void setup() {
        correctBracket = new CorrectBracket();
    }

    @Test
    void solution() {
        assertTrue(correctBracket.solution("()()"));
        assertTrue(correctBracket.solution("(())()"));
        assertFalse(correctBracket.solution(")()("));
        assertFalse(correctBracket.solution("(()("));
    }
}

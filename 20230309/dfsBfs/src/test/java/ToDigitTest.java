import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDigitTest {
    @Test
    void solution() {
        ToDigit toDigit = new ToDigit();

        assertEquals("1011", toDigit.solution(11));
    }
}

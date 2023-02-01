import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//- 숫자임을 판별하는 메서드 만들기
//- 0을 제거하는 메서드 만들기(parseInt로 해결되는지도 체크)

class ExtractNumbersTest {
    ExtractNumbers extractNumbers;

    @BeforeEach
    void setup() {
        extractNumbers = new ExtractNumbers();
    }

    @Test
    void isNumeric() {
        assertTrue(extractNumbers.isNumeric('1'));
        assertFalse(extractNumbers.isNumeric('a'));
    }

    @Test
    void getNumber() {
        assertEquals(208, extractNumbers.getNumber("g0en2T0s8eSoft"));
    }
}

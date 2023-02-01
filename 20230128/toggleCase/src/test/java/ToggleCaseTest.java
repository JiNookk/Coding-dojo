import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//- 소문자인지 대문자인지 구분하는 메서드 만들기
//- 문자 변환하는 메서드 만들기

class ToggleCaseTest {
    ToggleCase toggleCase;

    @BeforeEach
    void setup() {
        toggleCase = new ToggleCase();
    }

    @Test
    void isLowerCase() {
        assertTrue(toggleCase.isLowerCase("a"));
        assertFalse(toggleCase.isLowerCase("A"));
    }

    @Test
    void toggleCharacter() {
        assertEquals("A", toggleCase.toggleCharacter("a"));
        assertEquals("a", toggleCase.toggleCharacter("A"));
    }

    @Test
    void toggleCase() {
        assertEquals("sTUdy", toggleCase.toggleCase("StuDY"));
    }
}
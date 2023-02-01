import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//- 알파벳인지 구분하는 메서드
//- 뒤집는 메서드

class PalindromTest {
    Palindrom palindrom;

    @BeforeEach
    void setup() {
        palindrom = new Palindrom();
    }

    @Test
    void isAlphabetic() {
        assertTrue(palindrom.isAlphabetic('a'));
        assertFalse(palindrom.isAlphabetic('#'));
        assertFalse(palindrom.isAlphabetic('3'));
    }

    @Test
    void flip() {
        assertEquals("dnuof7", palindrom.flip("7found"));
    }

    @Test
    void strip() {
        String stripped = palindrom.strip("good7 ");
        assertEquals("good", stripped);
    }

    @Test
    void solution() {
        assertEquals("YES", palindrom.solution("goog7"));
        assertEquals("NO", palindrom.solution("good7"));
        assertEquals("YES", palindrom.solution("found7, time: study; Yduts; emit, 7Dnuof"));
    }
}

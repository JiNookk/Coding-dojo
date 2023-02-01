import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//- 단어를 뒤집는 메서드

class FlipWordTest {
    FlipWord flipWord;

    @BeforeEach
    void setup() {
        flipWord = new FlipWord();
    }

    @Test
    void filp() {
        assertEquals("doog", flipWord.flip("good"));
        assertEquals("emiT", flipWord.flip("Time"));
        assertEquals("giB", flipWord.flip("Big"));
    }
}

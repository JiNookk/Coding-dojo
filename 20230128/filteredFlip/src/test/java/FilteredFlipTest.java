import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//- 특수문자인지 구분하는 메서드
//- 단어를 뒤집는 메서드

class FilteredFlipTest {
    FilteredFlip filteredFlip;

    @BeforeEach
    void setup() {
        filteredFlip = new FilteredFlip();
    }

    @Test
    void filter() {
        assertFalse(filteredFlip.isAlphabet('#'));
        assertTrue(filteredFlip.isAlphabet('a'));
        assertFalse(filteredFlip.isAlphabet('1'));
    }

    @Test
    void filp() {
        assertEquals("S#T!EG*b@a", filteredFlip.flip("a#b!GE*T@S"));
    }
}

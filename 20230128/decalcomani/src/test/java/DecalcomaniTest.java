import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//- 회문문자열 체크 메서드

class DecalcomaniTest {
    Decalcomani decalcomani;

    @BeforeEach
    void setup() {
        decalcomani = new Decalcomani();
    }

    @Test
    void isDecalcomani() {
        assertEquals("YES", decalcomani.isDecalcomani("gooG"));
        assertEquals("NO", decalcomani.isDecalcomani("goo"));
    }
}

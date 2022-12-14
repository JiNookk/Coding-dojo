import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//  제거되면 true, 안제거되면 false => 제거 된 것을 어떻게 판별할까
//  연속된 문자를 제거하는 함수 -> 한 사이클에서 true, false를 반환한다.
//  false일 경우 0, length가 0일경우 true

class RemoveWithPairsTest {
    RemoveWithPairs removeWithPairs;

    @BeforeEach
    void setup() {
        removeWithPairs = new RemoveWithPairs();
    }

    @Test
    void removePair(){
        assertEquals("",removeWithPairs.removePair("baabaa"));
        assertEquals("cdcd",removeWithPairs.removePair("cdcd"));
        assertEquals("", removeWithPairs.removePair("aa"));
        assertEquals("", removeWithPairs.removePair("aaaaaa"));
    }

    @Test
    void isRemoved() {
        assertTrue(removeWithPairs.isRemoved(""));
        assertFalse(removeWithPairs.isRemoved("cdcd"));
    }

    @Test
    void solution() {
        assertEquals(1, removeWithPairs.solution("baabaa"));
        assertEquals(0, removeWithPairs.solution("cdcd"));
    }
}

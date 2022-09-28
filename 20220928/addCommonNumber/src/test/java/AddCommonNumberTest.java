import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddCommonNumberTest {
    @Test
    void solution() {
        AddCommonNumber addCommonNumber = new AddCommonNumber();

        assertEquals(43,addCommonNumber.solution(13, 17));
        assertEquals(52,addCommonNumber.solution(24, 27));
    }

    @Test
    void commonNumber() {
        AddCommonNumber addCommonNumber = new AddCommonNumber();

        assertEquals(4,addCommonNumber.commonNumberCount(10));
        assertEquals(6,addCommonNumber.commonNumberCount(12));
    }
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhonecketMonTest {
    @Test
    void solution() {
        PhonecketMon phonecketMon = new PhonecketMon();

        assertEquals(2, phonecketMon.solution(new int[]{3, 1, 2, 3}));
        assertEquals(3, phonecketMon.solution(new int[]{3, 3, 3, 2, 2, 4}));
        assertEquals(2, phonecketMon.solution(new int[]{3, 3, 3, 2, 2, 2}));
    }
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NthLCMTest {
    @Test
    void solution() {
        NthLCM nthLCM = new NthLCM();

        assertEquals(168,nthLCM.solution(new int[]{2, 6, 8, 14}));
        assertEquals(6, nthLCM.solution(new int[]{1, 2, 3}));
    }
}
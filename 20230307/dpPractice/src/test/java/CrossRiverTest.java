import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrossRiverTest {
    CrossRiver crossRiver;

    @BeforeEach
    void setup() {
        crossRiver = new CrossRiver();
    }

    @Test
    void solution() {
        assertEquals(34, crossRiver.solution(7));
    }
}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbStairsTest {
    ClimbStairs climbStairs;

    @BeforeEach
    void setup() {
        climbStairs = new ClimbStairs();
    }

    @Test
    void solution() {
        assertEquals(21, climbStairs.solution(7));
    }
}

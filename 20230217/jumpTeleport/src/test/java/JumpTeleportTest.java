import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpTeleportTest {
    @Test
    void solution() {
        JumpTeleport jumpTeleport = new JumpTeleport();

        assertEquals(2, jumpTeleport.solution(5));
        assertEquals(2, jumpTeleport.solution(6));
        assertEquals(5, jumpTeleport.solution(5000));
    }
}

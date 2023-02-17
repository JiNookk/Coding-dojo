import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//- 순간이동
//- 점프

class IronSuitTest {
    IronSuit ironSuit;

    @BeforeEach
    void setup() {
        ironSuit = new IronSuit(5000);
    }

    @Test
    void jump() {
        IronSuit jumped = ironSuit.jump(5);

        assertEquals(5, jumped.distance());
        assertEquals(5, jumped.batteryUsage());
    }

    @Test
    void teleport() {
        IronSuit jumped = ironSuit.jump(5);

        assertEquals(5, jumped.distance());
        assertEquals(5, jumped.batteryUsage());

        IronSuit teleported = jumped.teleport();

        assertEquals(10, teleported.distance());
        assertEquals(5, teleported.batteryUsage());
    }
}

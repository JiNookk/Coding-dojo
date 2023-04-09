import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DungeonTest {
    @Test
    void isAvailable() {
        Dungeon dungeon = new Dungeon(80, 0);

        assertTrue(dungeon.isAvailable(80));
        assertTrue(dungeon.isAvailable(90));
        assertFalse(dungeon.isAvailable(70));
    }
}

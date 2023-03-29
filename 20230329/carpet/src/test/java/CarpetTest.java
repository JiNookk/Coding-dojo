import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//- 1번식을 만족시키는 predicate 메서드 -> 1번식이 뭔데? -> 노랑 타일을 만족시키는 가로세로
//- 2번식을 만족시키는 predicate 메서드 -> 2번식이 뭔데? -> 갈색 타일 수를 만족시키는 가로세로
//- while

class CarpetTest {
    @Test
    void calculateWidth() {
        Carpet carpet = new Carpet();

        assertEquals(4, carpet.calculateWidth(10, 2));
        assertEquals(3, carpet.calculateWidth(8, 1));
        assertEquals(8, carpet.calculateWidth(24, 24));
    }

    @Test
    void calculateHeight() {
        Carpet carpet = new Carpet();

        assertEquals(3, carpet.calculateHeight(4, 10, 2));
        assertEquals(3, carpet.calculateHeight(3, 8, 1));
        assertEquals(6, carpet.calculateHeight(8, 24, 24));
    }

    @Test
    void satisfyYellowTile() {
        Carpet carpet = new Carpet(10, 2);

        assertTrue(carpet.satisfyYellowTile(4, 3, 2));
        assertFalse(carpet.satisfyYellowTile(4, 2, 2));

        assertTrue(carpet.satisfyYellowTile(3, 3, 1));
        assertTrue(carpet.satisfyYellowTile(8, 6, 24));
    }

    @Test
    void satisfyBrownTile() {
        Carpet carpet = new Carpet(10, 2);

        assertTrue(carpet.satisfyBrownTile(4, 3, 10));
        assertFalse(carpet.satisfyBrownTile(4, 3, 8));

        assertTrue(carpet.satisfyBrownTile(3, 3, 8));
        assertTrue(carpet.satisfyBrownTile(8, 6, 24));
    }
}
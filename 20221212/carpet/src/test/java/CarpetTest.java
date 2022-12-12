import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//  노랑과 브라운의 관계식을 만족하는 해를 찾는다 (노랑: m * n => 브라운: 2n + 2m + 4)
//  => m, n
//  전체 카펫의 길이를 리턴한다. => [m + 2, n + 2]
class CarpetTest {
    Carpet carpet;

    @BeforeEach
    void setup() {
        carpet = new Carpet();
    }

    @Test
    void findYellowRectangleSize() {
        assertArrayEquals(new int[]{1, 1}, carpet.findYellowRectangleSize(8, 1));
        assertArrayEquals(new int[]{2, 1}, carpet.findYellowRectangleSize(10, 2));
        assertArrayEquals(new int[]{6, 4}, carpet.findYellowRectangleSize(24, 24));
    }

    @Test
    void isYellowCount() {
        assertTrue(carpet.isYellowCount(1, 1, 1));
        assertFalse(carpet.isYellowCount(2, 1, 1));
        assertTrue(carpet.isYellowCount(6, 2, 3));
        assertTrue(carpet.isYellowCount(15, 5, 3));
        assertTrue(carpet.isYellowCount(6, 3, 2));
    }

    @Test
    void isBrownCount() {
        assertTrue(carpet.isBrownCount(10, 2, 1));
        assertTrue(carpet.isBrownCount(8, 1, 1));
        assertTrue(carpet.isBrownCount(24, 6, 4));
        assertFalse(carpet.isBrownCount(1, 5, 3));
    }

    @Test
    void isRoot() {
        assertTrue(carpet.isRoot(10, 2, 2, 1));
        assertTrue(carpet.isRoot(8, 1, 1, 1));
        assertTrue(carpet.isRoot(24, 24, 6, 4));
        assertFalse(carpet.isRoot(1, 15, 5, 3));
    }
}

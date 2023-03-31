import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void isInCircle() {
        Circle circle = new Circle(5);

        assertTrue(circle.isInCircle(0, 0));
        assertTrue(circle.isInCircle(5, 0));
        assertTrue(circle.isInCircle(0, 5));
        assertTrue(circle.isInCircle(3, 3));
        assertTrue(circle.isInCircle(4, 3));
        assertFalse(circle.isInCircle(4, 4));
    }
}

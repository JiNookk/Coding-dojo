import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HandTest {
    @Test
    void distance() {
        Hand leftHand = new Hand("left");
        Hand rightHand = new Hand("right");

        assertEquals(1, leftHand.distance(0));
        assertEquals(2, leftHand.distance(8));
        assertEquals(3, leftHand.distance(5));
        assertEquals(4, leftHand.distance(2));

        assertEquals(4, rightHand.distance(2));
        assertEquals(3, rightHand.distance(5));
        assertEquals(2, rightHand.distance(8));
        assertEquals(1, rightHand.distance(0));

        leftHand.press(1);

        assertEquals(2, leftHand.distance(5));
        assertEquals(4, leftHand.distance(0));
        assertEquals(3, leftHand.distance(8));

        leftHand.press(7);

        assertEquals(1, leftHand.distance(8));
        assertEquals(2, leftHand.distance(5));
        assertEquals(2, leftHand.distance(0));

        rightHand.press(2);

        assertEquals(1, rightHand.distance(5));
        assertEquals(3, rightHand.distance(0));
        assertEquals(2, rightHand.distance(8));
    }
}

//1 -2 -5 -8 -> 1 2 3 4 : 타겟이 더 크면 +1 작으면 + 2
//4 1 -2 -5 -> 2 1 2 3
// -1 -4 -7 -11 -> 1 2 3 4
// 2 -1 -4 -7 -> 2 1 2 3

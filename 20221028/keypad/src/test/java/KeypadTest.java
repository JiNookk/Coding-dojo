import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KeypadTest {
    @Test
    void solution() {
        Keypad keypad = new Keypad();

        assertEquals("LRLLLRLLRRL", keypad.solution(
                new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right"));

        assertEquals("LRLLRRLLLRR", keypad.solution(
                new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left"));

        assertEquals("LLRLLRLLRL", keypad.solution(
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right"));
    }

    @Test
    void pressButton() {
        Keypad keypad = new Keypad();

        Hand leftHand = new Hand("left");
        Hand rightHand = new Hand("right");

        assertEquals("L", keypad.pressButton(1, leftHand, rightHand, "right"));
        assertEquals("L", keypad.pressButton(4, leftHand, rightHand, "right"));
        assertEquals("L", keypad.pressButton(7, leftHand, rightHand, "right"));

        assertEquals("R", keypad.pressButton(3, leftHand, rightHand, "right"));
        assertEquals("R", keypad.pressButton(9, leftHand, rightHand, "right"));
        assertEquals("R", keypad.pressButton(6, leftHand, rightHand, "right"));

        assertEquals("L", keypad.pressButton(8, leftHand, rightHand, "right"));

    }
}

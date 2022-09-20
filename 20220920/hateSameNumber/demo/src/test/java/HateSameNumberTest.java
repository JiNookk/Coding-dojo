import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HateSameNumberTest {
    @Test
    void solution() {
        HateSameNumber hateSameNumber = new HateSameNumber();

        assertArrayEquals(new int[]{1, 3, 0, 1}, hateSameNumber.solution(new int[]{1, 1, 3, 3, 0, 1, 1}));

        assertArrayEquals(new int[]{4, 3}, hateSameNumber.solution(new int[]{4, 4, 4, 3, 3}));
    }
}
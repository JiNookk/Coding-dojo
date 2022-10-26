import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetireTest {
    @Test
    void solution() {
        Retire retire = new Retire();

        assertArrayEquals(new int[]{3, 5}, retire.solution(
                new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19}));

        assertArrayEquals(new int[]{1, 6}, retire.solution(
                new int[]{0, 0, 0, 0, 0, 0}, new int[]{31, 10, 45, 1, 6, 19}));

        assertArrayEquals(new int[]{1, 1}, retire.solution(
                new int[]{45, 4, 35, 20, 3, 9}, new int[]{20, 9, 3, 45, 4, 35}));
    }
}
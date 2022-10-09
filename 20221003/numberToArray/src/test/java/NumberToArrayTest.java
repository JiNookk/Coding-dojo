import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberToArrayTest {
    @Test
    void Solution() {
        NumberToArray numberToArray = new NumberToArray();

        long[] solution = numberToArray.solution(12345);

        assertArrayEquals(new long[]{5, 4, 3, 2, 1}, solution);

        long[] solution2 = numberToArray.solution(12345678910L);

        assertArrayEquals(new long[]{0, 1, 9, 8, 7, 6, 5, 4, 3, 2, 1}, solution2);
    }
}
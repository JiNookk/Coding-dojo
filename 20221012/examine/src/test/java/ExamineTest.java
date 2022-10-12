import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExamineTest {
    @Test
    void solution() {
        Examine examine = new Examine();

        assertArrayEquals(new int[]{1}, examine.solution(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{1, 2, 3}, examine.solution(new int[]{1, 3, 2, 4, 2}));
    }

    @Test
    void nthAnswer() {
        Examine examine = new Examine();

        int[] firstAnswer = examine.nthAnswer(1, new int[]{1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1});

        int[] secondAnswer = examine.nthAnswer(2, new int[]{1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1});

        int[] thirdAnswer = examine.nthAnswer(3, new int[]{1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1});

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1}, firstAnswer);
        assertArrayEquals(new int[]{2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2}, secondAnswer);
        assertArrayEquals(new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3}, thirdAnswer);
    }

    @Test
    void correct() {
        Examine examine = new Examine();

        int[] answers = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1};

        assertEquals(11,examine.correct(1, answers));
        assertEquals(1,examine.correct(2, answers));
        assertEquals(1,examine.correct(3, answers));
    }
}

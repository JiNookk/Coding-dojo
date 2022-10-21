import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PickToyTest {
    @Test
    void solution() {
        PickToy pickToy = new PickToy();

        int[][] board = new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };

        int[] moves = new int[]{1, 5, 3, 5, 1, 2, 1, 4};

        assertEquals(4, pickToy.solution(board, moves));
    }

    @Test
    void pick() {
        PickToy pickToy = new PickToy();

        int[][] board = new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };

        int[] moves = new int[]{1, 5, 3, 5, 1, 2, 1, 4};

        int[] result = pickToy.process(board, moves);

        int[] expected = new int[]{4, 3, 1, 1, 3, 2, 4};
        assertArrayEquals(expected, result);
    }
}
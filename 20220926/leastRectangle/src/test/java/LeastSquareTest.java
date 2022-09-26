import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeastSquareTest {
    @Test
    void bigSize() {
        LeastSquare leastSquare = new LeastSquare();

        int[][] sizes = new int[][]{
                {60, 50},
                {30, 70},
                {60, 30},
                {80, 40}
        };

        int[] ints = leastSquare.bigSize(sizes);

        assertArrayEquals(new int[]{60, 70, 60, 80}, ints);
    }

    @Test
    void smallSize() {
        LeastSquare leastSquare = new LeastSquare();

        int[][] sizes = new int[][]{
                {60, 50},
                {30, 70},
                {60, 30},
                {80, 40}
        };

        int[] ints = leastSquare.smallSize(sizes);

        assertArrayEquals(new int[]{50, 30, 30, 40}, ints);
    }

    @Test
    void maximum() {
        LeastSquare leastSquare = new LeastSquare();


        int[] bigsize = new int[]{60, 70, 60, 80};
        int[] smallSize = new int[]{50, 30, 30, 40};


        int maxWidth = leastSquare.maximum(bigsize);
        int maxHeight = leastSquare.maximum(smallSize);

        assertEquals(80, maxWidth);
        assertEquals(50, maxHeight);
    }

    @Test
    void solution() {
        LeastSquare leastSquare = new LeastSquare();

        int[][] sizes = new int[][]{
                {60, 50},
                {30, 70},
                {60, 30},
                {80, 40}
        };

        int solution = leastSquare.solution(sizes);

        assertEquals(4000, solution);
    }
}
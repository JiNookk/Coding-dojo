import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// 행렬변환 -> 세로로 읽을 수 있도록 변환
// 단위 행렬 곱하는 메서드

class MatrixMultipleTest {
    MatrixMultiple matrixMultiple;

    @BeforeEach
    void setup() {
        matrixMultiple = new MatrixMultiple();
    }

    @Test
    void convert() {
        assertArrayEquals(new int[][]{{5, 2, 3}, {4, 4, 1}, {3, 1, 1}},
                matrixMultiple.convert(new int[][]{{5, 4, 3}, {2, 4, 1}, {3, 1, 1}}));

        assertArrayEquals(new int[][]{{3, 3}, {3, 3}},
                matrixMultiple.convert(new int[][]{{3, 3}, {3, 3}}));

//        assertArrayEquals(new int[][]{{3, 2, 1}, {3, 2, 1}},
//                matrixMultiple.convert(new int[][]{{3, 3}, {2, 2}, {1, 1}}));
    }

    @Test
    void multiple() {
        assertEquals(15, matrixMultiple.multiple(new int[]{1, 4}, new int[]{3, 3}));
        assertEquals(22, matrixMultiple.multiple(new int[]{2, 3, 2}, new int[]{5, 2, 3}));
    }

    @Test
    void solution() {
        assertArrayEquals(new int[][]{{15, 15}, {15, 15}, {15, 15}},
                matrixMultiple.solution(new int[][]{{1, 4}, {3, 2}, {4, 1}}, new int[][]{{3, 3}, {3, 3}}));
    }
}

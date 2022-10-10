import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


// 일단 자르고 k번째 구하기
//
class KthNumberTest {
    @Test
    void sliceAndSortArray() {
        KthNumber kthNumber = new KthNumber();

        assertArrayEquals(new int[]{2,3,5,6},
                kthNumber.sliceAndSortArray(new int[]{1, 5, 2, 6, 3, 7, 4},
                        new int[]{2, 5, 3}));

        assertArrayEquals(new int[]{6},
                kthNumber.sliceAndSortArray(new int[]{1, 5, 2, 6, 3, 7, 4},
                        new int[]{4, 4, 1}));

        assertArrayEquals(new int[]{1,2,3,4,5,6,7},
                kthNumber.sliceAndSortArray(new int[]{1, 5, 2, 6, 3, 7, 4},
                        new int[]{1,7,3}));
    }

    @Test
    void getKthNumber() {
        KthNumber kthNumber = new KthNumber();

        int[] actual = kthNumber.sliceAndSortArray(new int[]{1, 5, 2, 6, 3, 7, 4},
                new int[]{2, 5, 3});

        assertEquals(5,kthNumber.getKthNumber(actual,3));
        assertEquals(6,kthNumber.getKthNumber(new int[]{6},1));
        assertEquals(3,kthNumber.getKthNumber(new int[]{1,2,3,4,5,6,7},3));
    }

    @Test
    void solution() {
        KthNumber kthNumber = new KthNumber();

        int[] solution = kthNumber.solution(new int[]{1, 5, 2, 6, 3, 7, 4},
                new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});

//        assertEquals(3,solution.length);

        assertArrayEquals(new int[]{5, 6, 3},
                solution);
    }
}
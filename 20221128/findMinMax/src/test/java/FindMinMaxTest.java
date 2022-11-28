import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//- 공백을 split을 이용해서 분리
//- 최댓값, 최솟값을 찾아내기
//- 다시 문자열로 결합하기

class FindMinMaxTest {
    FindMinMax findMinMax;

    @BeforeEach
    void setup() {
        findMinMax = new FindMinMax();
    }

    @Test
    void getLetters() {
        int[] letters1 = findMinMax.getLetters("1 2 3 4");
        int[] letters2 = findMinMax.getLetters("-1 -2 -3 -4");

        assertArrayEquals(letters1, new int[]{1, 2, 3, 4});
        assertArrayEquals(letters2, new int[]{-1, -2, -3, -4});
    }

    @Test
    void getMinMax() {
        int[] letters1 = findMinMax.getLetters("1 2 3 4");
        int[] letters2 = findMinMax.getLetters("-1 -2 -3 -4");

        String minMax1 = findMinMax.getMinMax(letters1);
        String minMax2 = findMinMax.getMinMax(letters2);

        assertEquals(minMax1, "1 4");
        assertEquals(minMax2, "-4 -1");
    }

    @Test
    void findMinMax() {
        String minMax1 = findMinMax.minMax("1 2 3 4");
        String minMax2 = findMinMax.minMax("-1 -2 -3 -4");
        String minMax3 = findMinMax.minMax("-1 -1");

        assertEquals(minMax1, "1 4");
        assertEquals(minMax2, "-4 -1");
        assertEquals(minMax3, "-1 -1");
    }
}
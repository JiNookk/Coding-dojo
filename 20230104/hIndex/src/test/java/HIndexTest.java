import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// 정렬하는 메서드
// 수를 넣으면 h 인덱스를 만족하는지 구하는 메서드
// 1씩 증가시켜가면서 h인덱스 구하기

class HIndexTest {
    HIndex hIndex;

    @BeforeEach
    void setup() {
        hIndex = new HIndex();
    }

    @Test
    void sort() {
        assertArrayEquals(new int[]{6, 5, 3, 1, 0}, hIndex.sort(new int[]{3, 0, 6, 1, 5}));
        assertArrayEquals(new int[]{4, 3, 2, 1}, hIndex.sort(new int[]{1, 2, 3, 4}));
    }

    @Test
    void isHIndex() {
        assertTrue(hIndex.isHIndex(new int[]{6, 5, 3, 1, 0}, 3));
        assertFalse(hIndex.isHIndex(new int[]{6, 5, 3, 1, 0}, 4));
    }

    @Test
    void solution() {
        assertEquals(3, hIndex.solution(new int[]{3, 0, 6, 1, 5}));
        assertEquals(5, hIndex.solution(new int[]{10, 10, 10, 10, 10}));
    }
}

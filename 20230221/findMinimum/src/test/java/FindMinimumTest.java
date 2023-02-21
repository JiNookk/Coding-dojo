import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//- 정렬
//- 내적

class FindMinimumTest {
    FindMinimum findMinimum;

    @BeforeEach
    void setup() {
        findMinimum = new FindMinimum();
    }

    @Test
    void dotProduct() {
        assertEquals(29, findMinimum.dotProduct(new int[]{1, 4, 2}, new int[]{5, 4, 4}));
        assertEquals(11, findMinimum.dotProduct(new int[]{1, 2}, new int[]{3, 4}));
    }

    @Test
    void solution() {
        assertEquals(29, findMinimum.solution(new int[]{1, 4, 2}, new int[]{5, 4, 4}));
        assertEquals(10, findMinimum.solution(new int[]{1, 2}, new int[]{3, 4}));
    }
}

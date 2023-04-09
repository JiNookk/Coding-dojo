import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

//- 삽입
//- 최대 제거
//- 최소 제거

class SolutionTest {
    Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void insert() {
        solution.insert(5);

        assertEquals(5, solution.minHeap.peek());
        assertEquals(5, solution.maxHeap.peek());

        solution.insert(1);

        assertEquals(1, solution.minHeap.peek());
        assertEquals(5, solution.maxHeap.peek());
    }

    @Test
    void removeMin() {
        solution.insert(5);
        solution.insert(1);
        solution.insert(3);

        assertEquals(1, solution.removeMin());
        assertEquals(3, solution.minHeap.peek());
    }

    @Test
    void removeMax() {
        solution.insert(5);
        solution.insert(1);
        solution.insert(3);

        assertEquals(5, solution.removeMax());
        assertEquals(3, solution.maxHeap.peek());
    }

    @Test
    void solution() {
        assertArrayEquals(new int[]{0, 0},
                solution.solution(new String[]{"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"}));
        assertArrayEquals(new int[]{333, -45},
                solution.solution(new String[]{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"}));
    }
}

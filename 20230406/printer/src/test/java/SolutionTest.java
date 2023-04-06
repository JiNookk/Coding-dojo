import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void isBiggest() {
        Deque<Document> documents = new LinkedList<>();
        List.of(2, 1, 3, 2).forEach((number) -> documents.add(new Document(documents.size(), number)));

        assertFalse(solution.isBiggest(documents));

        solution.rotate(documents);
        assertFalse(solution.isBiggest(documents));

        solution.rotate(documents);
        assertTrue(solution.isBiggest(documents));

    }

    @Test
    void solution() {
        assertEquals(1, solution.solution(new int[]{2, 1, 3, 2}, 2));
        assertEquals(5, solution.solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
    }
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @Test
    void solution() {
        Fibonacci fibonacci = new Fibonacci();

        assertEquals(1, fibonacci.solution(1));
        assertEquals(1, fibonacci.solution(2));
        assertEquals(2, fibonacci.solution(3));
        assertEquals(3, fibonacci.solution(4));
        assertEquals(5, fibonacci.solution(5));
        assertEquals(8, fibonacci.solution(6));
        assertEquals(13, fibonacci.solution(7));
        assertEquals(13, fibonacci.solution(45));
    }
}

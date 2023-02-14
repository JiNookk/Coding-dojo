import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//  피보나치 수를 구하는 메서드를 만든다. -> 0일때 0, 1일 때 1, 2부터는 이전거 + 이이전거

class FibonacciTest {
    Fibonacci fibonacci;

    @BeforeEach
    void setup() {
        fibonacci = new Fibonacci();
    }

    @Test
    void fibonacciNumber() {
        assertEquals(0, fibonacci.fibonacciNumber(0));
        assertEquals(1, fibonacci.fibonacciNumber(1));
        assertEquals(2, fibonacci.fibonacciNumber(3));
        assertEquals(5, fibonacci.fibonacciNumber(5));
    }

    @Test
    void solution() {
        assertEquals(2, fibonacci.solution(3));
        assertEquals(5, fibonacci.solution(5));
    }
}

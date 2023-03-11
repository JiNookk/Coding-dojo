import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @Test
    void factorial() {
        Factorial factorial = new Factorial();

        assertEquals(120, factorial.solution(5));
        assertEquals(1, factorial.solution(1));
    }
}

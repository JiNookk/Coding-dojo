import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExchangeCoinTest {
    ExchangeCoin exchangeCoin;

    @BeforeEach
    void setup() {
        exchangeCoin = new ExchangeCoin();
    }

    @Test
    void solution() {
        assertEquals(3, exchangeCoin.solution(3, new int[]{1, 2, 5}, 15));
    }
}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//- 교환이라는 객체?를 만든다.
//- 콜라를 교환하는 메서드 a, b를 전달 -> 빈병 추가

class ExchangerTest {
    Exchanger exchanger;

    @BeforeEach
    void setup() {
        exchanger = new Exchanger(20);
    }

    @Test
    void exchange() {
        assertEquals(exchanger.exchange(2, 1), 19);

        exchanger = new Exchanger(20);
        assertEquals(exchanger.exchange(3, 1), 9);
    }
}

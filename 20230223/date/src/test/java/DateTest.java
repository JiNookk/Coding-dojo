import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

//- Date객체 -> 월별로 일수를 받는다.
//- a월 b일 -> 날짜로 변환하는 함수를 만든다.
//- 날짜 -> 요일로 바꾸는 함수를 만든다.

class DateTest {
    Date date;

    @BeforeEach
    void setup() {
        date = new Date(true);
    }

    @Test
    void getMonthlyDates() {
        Map<Integer, Integer> monthlydates = date.getMonthlyDates(true);
    }

    @Test
    void toDate() {
        assertEquals(24, date.toDate(1, 24));
        assertEquals(55, date.toDate(2, 24));
        assertEquals(84, date.toDate(3, 24));
        assertEquals(366, date.toDate(12, 31));
    }

    @Test
    void toDay() {
        assertEquals("FRI", date.toDay(1, 1));
        assertEquals("TUE", date.toDay(5, 24));
        assertEquals("FRI", date.toDay(1, 22));
    }
}

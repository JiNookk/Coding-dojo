import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

// 차량번호, 기록 입력 -> 총 주차시간 계산
// 시간 주어짐 -> 주차요금 계산

class ParkingTest {
    Parking parking;

    @BeforeEach
    void setup() {
        parking = new Parking();
    }

    @Test
    void minutes() {
        assertEquals(34, parking.difference("06:00", "06:34"));
        assertEquals(300, parking.difference("18:59", null));
    }

    @Test
    void parkingTime() {
        assertEquals(334, parking.parkingTime("0000", List.of(
                "05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN",
                "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT")));

        assertEquals(670, parking.parkingTime("0148", List.of(
                "05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN",
                "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT")));

        assertEquals(146, parking.parkingTime("5961", List.of(
                "05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN",
                "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT")));
    }

    @Test
    void parkingFee() {
        assertEquals(14600, parking.parkingFee(334, new int[]{180, 5000, 10, 600}));
        assertEquals(34400, parking.parkingFee(670, new int[]{180, 5000, 10, 600}));
        assertEquals(5000, parking.parkingFee(146, new int[]{180, 5000, 10, 600}));
    }

    @Test
    void solution() {
        assertArrayEquals(new int[]{14600, 34400, 5000},
                parking.solution(
                        new int[]{180, 5000, 10, 600}, new String[]{
                                "05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN",
                                "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"
                        }));

        assertArrayEquals(new int[]{0, 591},
                parking.solution(
                        new int[]{120, 0, 60, 591}, new String[]{
                                "16:00 3961 IN", "16:00 0202 IN", "18:00 3961 OUT", "18:00 0202 OUT", "23:58 3961 IN"
                        }));

        assertArrayEquals(new int[]{14841},
                parking.solution(
                        new int[]{1, 461, 1, 10}, new String[]{
                                "00:00 1234 IN"
                        }));
    }
}

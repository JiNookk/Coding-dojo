import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//- 문자열과 문자가 주어지면 길이를 추출하는 메서드(문자열 배열 -> 길이 배열)

class DistanceTest {
    Distance distance;

    @BeforeEach
    void setup() {
        distance = new Distance();
    }

    @Test
    void targetIndex() {
        List<Integer> list = distance.targetIndexList("teachermode", 'e');

        assertEquals(List.of(1, 5, 10), list);
    }

    @Test
    void distance() {
        assertEquals(1, distance.getDistance(List.of(1, 5, 10), 2));
        assertEquals(2, distance.getDistance(List.of(1, 5, 10), 3));
        assertEquals(1, distance.getDistance(List.of(1, 5, 10), 4));
        assertEquals(2, distance.getDistance(List.of(1, 5, 10), 8));
    }

    @Test
    void toLengthList() {
        List<Integer> lengthList = distance.toLengthArray("teachermode", 'e');

        assertEquals(List.of(1, 0, 1, 2, 1, 0, 1, 2, 2, 1, 0), lengthList);
    }
}

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

// 무게제한과 비교를 한다. -> 초과일 경우 false, 이하일 경우 true
// true일 경우 맨앞, 맨뒤를 제거, false일 경우 맨뒤만 제거하는 함수를 만든다.

class LifeBoatTest {
    @Test
    void isOverCapacity() {
        int capacity = 100;

        LifeBoat lifeBoat = new LifeBoat(capacity);

        assertTrue(lifeBoat.isOverCapacity(30, 80));
        assertFalse(lifeBoat.isOverCapacity(20, 80));
    }

    @Test
    void rescue() {
        List<Integer> weights = List.of(50, 50, 70, 80);
        List<Integer> people = new ArrayList<>(weights);

        LifeBoat lifeBoat = new LifeBoat(100);

        assertEquals(List.of(50, 50, 70), lifeBoat.rescue(people));
        assertEquals(List.of(50), lifeBoat.rescue(List.of(30, 50, 70)));
    }

//    @Test
//    void rescue() {
//        List<Integer> weights = List.of(50, 50, 70, 80);
//        List<Integer> people = new ArrayList<>(weights);
//
//        LifeBoat lifeBoat = new LifeBoat(100);
//
//        lifeBoat.rescue(people);
//
//        assertEquals(List.of(50, 50, 70), people);
//
//        List<Integer> people1 = new ArrayList<>(List.of(30, 50, 70));
//        lifeBoat.rescue(people1);
//
//        assertEquals(List.of(50), people1);
//    }
}

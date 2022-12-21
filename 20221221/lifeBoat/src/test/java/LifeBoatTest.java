import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

// 한번 구조할 때마다 최대한 태우기 -> 원래 배열에서 소거를 해야한다.(리스트로 변환 필요)
// 구명보트의 수를 구하기 -> 인자로 온 리스트의 길이가 0이 될 때까지

class LifeBoatTest {
    LifeBoat lifeBoat;

    @BeforeEach
    void setup() {
        lifeBoat = new LifeBoat();
    }

    @Test
    void toList() {
        List<Integer> weights = lifeBoat.toList(new int[]{70, 50, 80, 50});

        assertEquals(List.of(70, 50, 80, 50), weights);
    }

    @Test
    void remains() {
        List<Integer> weights1 = lifeBoat.toList(new int[]{70, 50, 80, 50});
        List<Integer> weights2 = lifeBoat.toList(new int[]{70, 50, 80});

        assertEquals(List.of(70, 80), lifeBoat.remains(100, weights1));
        assertEquals(List.of(70, 80), lifeBoat.remains(100, weights2));
    }

    @Test
    void required() {
        List<Integer> weights1 = lifeBoat.toList(new int[]{70, 50, 80, 50});
        List<Integer> weights2 = lifeBoat.toList(new int[]{70, 50, 80});

        int limit = 100;

        assertEquals(3, lifeBoat.required(limit, weights1));
        assertEquals(3, lifeBoat.required(limit, weights2));
    }

    @Test
    void solution() {
        assertEquals(3, lifeBoat.solution(new int[]{70, 50, 80, 50}, 100));
        assertEquals(3, lifeBoat.solution(new int[]{70, 80, 50}, 100));
        assertEquals(2, lifeBoat.solution(new int[]{70, 50, 80, 50, 90, 40}, 240));
    }
}

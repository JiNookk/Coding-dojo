import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

// 튜플의 원소를 반환하는 메서드 => 숫자 리스트로
// 튜플 정렬하기 => 리스트의 크기로
// 튜플을 생성하는 메서드 => set을 이용하기
// 정답 반환하기

class TupleTest {
    Tuple tuple;

    @BeforeEach
    void setup() {
        tuple = new Tuple();
    }

    @Test
    void toElement() {
        assertEquals(List.of("2", "2,1", "2,1,3", "2,1,3,4"),
                tuple.toElement("{{2},{2,1},{2,1,3},{2,1,3,4}}"));
    }

    @Test
    void sort() {
        assertEquals(List.of("2", "2,1", "2,1,3", "2,1,3,4"),
                tuple.sort(List.of("2,1,3", "2,1", "2", "2,1,3,4")));

        assertEquals(List.of("1,222222222222", "222222222222"),
                tuple.sort(List.of("222222222222", "1,222222222222")));
    }

    @Test
    void store() {
        Set<Integer> stored = tuple.store(List.of("2", "2,1", "2,1,3", "2,1,3,4"));

        assertEquals(Set.of(2, 1, 3, 4), stored);
    }

    @Test
    void solution() {
        assertArrayEquals(new int[]{2, 1, 3, 4}, tuple.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}"));
        assertArrayEquals(new int[]{2, 1, 3, 4}, tuple.solution("{{1,2,3},{2,1},{1,2,4,3},{2}}"));
        assertArrayEquals(new int[]{111, 20}, tuple.solution("{{20,111},{111}}"));
        assertArrayEquals(new int[]{123}, tuple.solution("{{123}}"));
        assertArrayEquals(new int[]{3, 2, 4, 1}, tuple.solution("{{4,2,3},{3},{2,3,4,1},{2,3}}"));
    }
}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

// 도시 배열을 실제로 사용하는 함수

class CacheTest {
    Cache cache;

    @BeforeEach
    void setup() {
        cache = new Cache();
    }

    // 캐시를 만들어야 한다. => 캐시 사이즈 유지, 캐시의 순서 변경 LinkedHashMap?
    @Test
    void updated() {
        List<String> updated =  cache.updated("Jeju", 3);

        assertEquals(1, updated.size());

        List<String> updated2 = cache.updated("Pangyo", 3);

        assertEquals(2, updated2.size());

        List<String> updated3 = cache.updated("Seoul", 3);

        assertEquals(3, updated3.size());

        List<String> updated4 = cache.updated("NewYork", 3);

        assertEquals(3, updated4.size());
        assertEquals("newyork", updated4.get(2));

        List<String> updated5 = cache.updated("Pangyo", 3);
        assertEquals(3, updated5.size());

        assertEquals("pangyo", updated5.get(2));
        assertEquals("seoul", updated5.get(0));
    }

    @Test
    void isDuplicated() {
        cache.add("NewYork");
        cache.add("Pangyo");
        cache.add("Jeju");

        assertTrue(cache.isDuplicated("NewYork"));
    }

    @Test
    void executeTime() {
        assertEquals(5, cache.executeTime("NewYork"));

        cache.add("NewYork");
        assertEquals(1, cache.executeTime("NewYork"));
    }

    @Test
    void solution() {
        assertEquals(50, cache.solution(3, new String[]{
                "Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));

        assertEquals(21, cache.solution(3, new String[]{
                "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"}));

        assertEquals(60, cache.solution(2, new String[]{
                "Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco",
                "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));

        assertEquals(52, cache.solution(5, new String[]{
                "Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris",
                "Jeju", "NewYork", "Rome"}));

        assertEquals(16, cache.solution(2, new String[]{
                "Jeju", "Pangyo", "NewYork", "newyork"}));

        assertEquals(25, cache.solution(0, new String[]{
                "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
    }
}

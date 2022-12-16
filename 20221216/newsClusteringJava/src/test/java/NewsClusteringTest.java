import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 문자를 2글자씩 자르는 함수
// 영문자 이외의 청킹을 걸러내는 함수
// 소문자화 하는 함수
// => 다중집합을 구하는 함수
// 합집합을 구하는 함수
// 교집합을 구하는 함수
// 자카드 유사도를 구하는 함수

class NewsClusteringTest {
    NewsClustering newsClustering;

    @BeforeEach
    void setup() {
        newsClustering = new NewsClustering();
    }

    @Test
    void toMultipleSet() {
        assertEquals(List.of("fr", "ra", "an", "nc", "ce"), newsClustering.toMultipleSet("FRANCE"));
        assertEquals(List.of("sh", "ha", "ak", "ke", "ha", "an", "nd", "ds"), newsClustering.toMultipleSet("shake hands"));
        assertEquals(List.of("ha", "an", "nd", "ds", "sh", "ha", "ak", "ke"), newsClustering.toMultipleSet("handshake"));
        assertEquals(List.of("aa", "aa"), newsClustering.toMultipleSet("aa1+aa2"));
    }

    @Test
    void union() {
        assertEquals(List.of("aa", "aa", "aa"), newsClustering.union(List.of("aa", "aa", "aa"), List.of("aa", "aa")));

//        assertEquals(List.of("de", "fr"), newsClustering.union(List.of("fr"), List.of("fr", "de")));
//        assertEquals(List.of("de", "fr"), newsClustering.union(List.of("fr"), List.of("fr", "de")));
//        assertEquals(List.of("de", "fr"), newsClustering.union(List.of("fr"), List.of("de")));
    }

    @Test
    void intersection() {
        assertEquals(Set.of("fr"), newsClustering.intersection(Set.of("fr"), Set.of("fr", "de")));
        assertEquals(Set.of(), newsClustering.intersection(Set.of("fr"), Set.of("de")));
    }

    @Test
    void jaccardSimilarity() {
        assertEquals(16384, newsClustering.jaccardSimilarity(1, 4));
        assertEquals(65536, newsClustering.jaccardSimilarity(1, 1));
    }

    @Test
    void solution() {
        assertEquals(16384, newsClustering.solution("FRANCE", "french"));
        assertEquals(65536, newsClustering.solution("handshake", "shake hands"));
        assertEquals(43690, newsClustering.solution("aa1+aa2", "AAAA12"));
        assertEquals(65536, newsClustering.solution("E=M*C^2", "e=m*c^2"));
    }
}

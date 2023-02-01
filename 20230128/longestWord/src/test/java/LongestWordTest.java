import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//- 단어의 길이를 계산하는 메서드
//- 길이의 최댓값을 비교하는 메서드(길이가 같은경우 갱신하지 않는다.)

class LongestWordTest {
    LongestWord longestWord;

    @BeforeEach
    void setup() {
        longestWord = new LongestWord();
    }

    @Test
    void length() {
        assertEquals(5, longestWord.length("Hello"));
    }

    @Test
    void findMax() {
        assertEquals(2, longestWord.findMax(List.of(1, 2, 5, 3, 5)));
        assertEquals(4, longestWord.findMax(List.of(1, 2, 4, 3, 5)));
        assertEquals(0, longestWord.findMax(List.of(5, 2, 4, 3, 5)));
        assertEquals(0, longestWord.findMax(List.of(5)));
        assertEquals(0, longestWord.findMax(List.of(5, 5, 5)));
    }

    @Test
    void solution() {
        assertEquals("study", longestWord.solution("it is time to study"));
        assertEquals("begin", longestWord.solution("it is begin to study"));
        assertEquals("begin", longestWord.solution("begin"));
        assertEquals("it", longestWord.solution("it it it"));
    }
}
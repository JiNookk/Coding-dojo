import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//        - 문자열을 단어로 분리
//        - 문자열의 첫 글자를 대문자로 -> 숫자라면 어떻게 하지?
//        - 문자열의 나머지 글자를 소문자로 변환
class JadenCaseStringTest {
    JadenCaseString jadenCaseString;

    @BeforeEach
    void setup() {
        jadenCaseString = new JadenCaseString();
    }

    @Test
    void solution() {
        String sentence1 = "3people unFollowed me";
        String sentence2 = "for the last week";
        String sentence3 = "for  the  last week  ";
        String sentence4 = "a aa";
        String sentence5 = "a a a   ";

        assertEquals("3people Unfollowed Me",jadenCaseString.solution(sentence1));
        assertEquals("For The Last Week",jadenCaseString.solution(sentence2));
        assertEquals("For  The  Last Week  ",jadenCaseString.solution(sentence3));
        assertEquals("A Aa",jadenCaseString.solution(sentence4));
        assertEquals("A A A   ",jadenCaseString.solution(sentence5));
    }

    @Test
    void changeWordCase() {
        String word1 = jadenCaseString.changeWordCase("3people");
        String word2 = jadenCaseString.changeWordCase("unFollowed");
        String word3 = jadenCaseString.changeWordCase("last");

        assertEquals(word3, "Last");
        assertEquals(word2, "Unfollowed");
        assertEquals(word1, "3people");
    }
}

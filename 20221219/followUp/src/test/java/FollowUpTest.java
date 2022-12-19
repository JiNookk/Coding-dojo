import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// 틀린것을 validate -> 한글자인지, 이전에 등장했던 단어인지, 앞서 말한 단어의 마지막 문자인지
// 사람의 번호구하기
// 몇번째 사이클인지 구하기
class FollowUpTest {
    FollowUp followUp;

    @BeforeEach
    void setup() {
        followUp = new FollowUp();
    }

    @Test
    void validateWordLength() {
        assertFalse(followUp.validateWordLength("w"));
        assertFalse(followUp.validateWordLength(""));
        assertTrue(followUp.validateWordLength("word"));
        assertTrue(followUp.validateWordLength("wo"));
    }

    @Test
    void validateFirstLetter() {
        assertFalse(followUp.validateFirstLetter("book", "atom"));
        assertFalse(followUp.validateFirstLetter("power", "marinade"));
        assertTrue(followUp.validateFirstLetter("word", "dinosaur"));
        assertTrue(followUp.validateFirstLetter("wo", "orange"));
        assertFalse(followUp.validateFirstLetter("book", ""));
    }

    @Test
    void validateUnique() {
        assertEquals(8, followUp.validate(
                new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"}));
        assertEquals(4, followUp.validate(
                new String[]{"hello", "one", "even", "never", "now", "world", "draw"}));
        assertEquals(0, followUp.validate(
                new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure",
                        "establish", "hang", "gather", "refer", "reference", "estimate", "executive"}));
    }

    @Test
    void getDropout() {
        assertArrayEquals(new int[]{3, 3}, followUp.getDropout(3, 8));

        assertArrayEquals(new int[]{0, 0}, followUp.getDropout(5, 0));

        assertArrayEquals(new int[]{1, 3}, followUp.getDropout(2, 4));
    }

    @Test
    void solution() {
        int[] answer1 = followUp.solution(3,
                new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"});

        int[] answer2 = followUp.solution(5,
                new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"});

        int[] answer3 = followUp.solution(2,
                new String[]{"hello", "one", "even", "never", "now", "world", "draw"});

        assertArrayEquals(new int[]{0, 0}, answer2);
        assertArrayEquals(new int[]{1, 3}, answer3);
        assertArrayEquals(new int[]{3, 3}, answer1);
    }
}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//- 소문자화 하는 함수를 만든다.
//- 문자의 개수를 새는 함수를 만든다.

class FindCharacterTest {
    FindCharacter findCharacter;

    @BeforeEach
    void setup() {
        findCharacter = new FindCharacter();
    }

    @Test
    void toLowerCase() {
        assertEquals("computercooler", findCharacter.toLowerCase("Computercooler"));
        assertEquals("ccc", findCharacter.toLowerCase("CCC"));
    }

    @Test
    void countLetter() {
        assertEquals(2, findCharacter.countLetter("Computercooler", "c"));
        assertEquals(3, findCharacter.countLetter("Computercooler", "o"));
    }
}
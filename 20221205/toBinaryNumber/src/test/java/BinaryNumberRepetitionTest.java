import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryNumberRepetitionTest {
    BinaryNumberRepetition binaryNumberRepetition;

    @BeforeEach
    void setup() {
        binaryNumberRepetition = new BinaryNumberRepetition();
    }

    //- 0을 지운 문자열을 반환
    //- 문자열의 길이를 이진수로 변환한다.
    //- 배열에 이진 변환의 횟수와 변환 과정에서 제거된 모든 0의 개수를 배열에 담아 리턴한다.

    @Test
    void binaryWithoutZero() {
        String binary1 = binaryNumberRepetition.binaryWithoutZero("0111010");
        String binary2 = binaryNumberRepetition.binaryWithoutZero("01110");
        String binary3 = binaryNumberRepetition.binaryWithoutZero("110010101001");

        assertEquals("1111", binary1);
        assertEquals("111", binary2);
        assertEquals("111111", binary3);
    }

    @Test
    void lengthToBinary() {
        String binary1 = binaryNumberRepetition.lengthToBinary(4);
        String binary2 = binaryNumberRepetition.lengthToBinary(3);
        String binary3 = binaryNumberRepetition.lengthToBinary(6);

        assertEquals("100", binary1);
        assertEquals("11", binary2);
        assertEquals("110", binary3);
    }

    @Test
    void eraseCount() {
        int count1 = binaryNumberRepetition.eraseCount("0111010", "1111");
        int count2 = binaryNumberRepetition.eraseCount("01110", "111");
        int count3 = binaryNumberRepetition.eraseCount("110010101001", "111111");

        assertEquals(3, count1);
        assertEquals(2, count2);
        assertEquals(6, count3);
    }

    @Test
    void solution() {
        int[] answer1 = binaryNumberRepetition.solution("110010101001");
        int[] answer2 = binaryNumberRepetition.solution("01110");
        int[] answer3 = binaryNumberRepetition.solution("1111111");

        assertArrayEquals(new int[]{3, 8}, answer1);
        assertArrayEquals(new int[]{3, 3}, answer2);
        assertArrayEquals(new int[]{4, 1}, answer3);
    }
}
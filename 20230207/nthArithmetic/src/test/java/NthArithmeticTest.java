import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//- 십진수를 n진수로 변환하는 메서드
//- 미리 구할 숫자의 개수, 참가인원, 튜브 순서 입력 -> 몇번째 숫자를 구해야 하는지 인덱스 전달

class NthArithmeticTest {
    NthArithmetic nthArithmetic;

    @BeforeEach
    void setup() {
        nthArithmetic = new NthArithmetic();
    }

    @Test
    void toNthArithmetic() {
        assertEquals("1", nthArithmetic.toNthArithmetic(2, 1));
        assertEquals("10", nthArithmetic.toNthArithmetic(2, 2));
        assertEquals("F", nthArithmetic.toNthArithmetic(16, 15));
    }

    @Test
    void getArithmeticString() {
        assertEquals("0110111001", nthArithmetic.getArithmeticString(10, 2));
        assertEquals("01210", nthArithmetic.getArithmeticString(5, 3));
    }

    @Test
    void getIndexes() {
        assertEquals(List.of(1, 3, 5, 7), nthArithmetic.getIndexes(4, 2, 1));
    }

    @Test
    void solution() {
        assertEquals("0111", nthArithmetic.solution(2, 4, 2, 1));
        assertEquals("02468ACE11111111", nthArithmetic.solution(16, 16, 2, 1));
        assertEquals("13579BDF01234567", nthArithmetic.solution(16, 16, 2, 2));
    }
}

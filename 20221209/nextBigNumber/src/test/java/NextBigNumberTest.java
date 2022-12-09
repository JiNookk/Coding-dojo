import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//    - n+1 부터 탐색 시작
//    - n을 2진수로 변환했을 때 1의 개수가 같다!
//    - 2진수에서 1이 꽉차있으면? => 1이 한칸 앞으로,
//    - 1이 꽉차 있지 않으면? => 두번째 1을 왼쪽으로 한칸, 나머지 오른쪽 1들은 왼쪽 끝으로
//    - 왼쪽으로 한 칸 옮기는 거 함수 하나, 오른쪽으로 다 미는거 함수 하나

class NextBigNumberTest {
    NextBigNumber nextBigNumber;

    @BeforeEach
    void setup() {
        nextBigNumber = new NextBigNumber();
    }

    @Test
    void toBinaryNumber() {
        assertEquals("1001110", nextBigNumber.toBinaryString(78));
        assertEquals("1010011", nextBigNumber.toBinaryString(83));
        assertEquals("1111", nextBigNumber.toBinaryString(15));
        assertEquals("10111", nextBigNumber.toBinaryString(23));
    }

    @Test
    void solution() {
        assertEquals(23, nextBigNumber.solution(15));
        assertEquals(83, nextBigNumber.solution(78));
        assertEquals(4, nextBigNumber.solution(2));
        assertEquals(2, nextBigNumber.solution(1));
    }

    @Test
    void count() {
        assertEquals(4, nextBigNumber.count("1111"));
        assertEquals(3, nextBigNumber.count("10011"));
    }
}
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//  - 등차수열의 합 공식 사용 => n(n+1)/2
//  - n가지 이상이 나올 수 없다는 것을 표현해줘야함.
//  - 길이가 n일때 연속된 숫자가 있는지 구하는 메서드 -> t/f로 반환
//  - 공차가 1 이여야 함. => 어케구현하노??

class NumberExpressionTest {
    NumberExpression numberExpression;

    @BeforeEach
    void setup() {
        numberExpression = new NumberExpression();
    }

    @Test
    void sum() {
        int result1 = numberExpression.sum(5,5); // 5, 6, 7, 8, 9
        int result2 = numberExpression.sum(1,5); // 1, 2, 3, 4, 5

        assertEquals(35, result1);
        assertEquals(15, result2);
    }

    @Test
    void maximumSize() {
        int maximumSize1 = numberExpression.maximumSize(15); // 5, 6, 7, 8, 9
        int maximumSize2 = numberExpression.maximumSize(10); // 1, 2, 3, 4, 5

        assertEquals(5, maximumSize1);
        assertEquals(4, maximumSize2);
    }

    @Test
    void isExpressionExist() {
//        boolean expressionExist = numberExpression.isExpressionExist(1, 10);
        boolean expressionExist1 = numberExpression.isExpressionExist(2, 10);
        boolean expressionExist2 = numberExpression.isExpressionExist(3, 10);
        boolean expressionExist3 = numberExpression.isExpressionExist(4, 10);

//        assertTrue(expressionExist);
        assertFalse(expressionExist1);
        assertFalse(expressionExist2);
        assertTrue(expressionExist3);
    }

    @Test
    void solution() {
        int answer1 = numberExpression.solution(15);
        int answer2 = numberExpression.solution(10);

        assertEquals(4, answer1);
        assertEquals(2, answer2);
    }
}
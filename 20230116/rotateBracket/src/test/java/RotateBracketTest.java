import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// 올바른 괄호쌍인지 판별하는 메서드
// 왼쪽으로 한칸씩 옮기는 메서드

class RotateBracketTest {
    RotateBracket rotateBracket;

    @BeforeEach
    void setup() {
        rotateBracket = new RotateBracket();
    }

    @Test
    void validate() {
        assertTrue(rotateBracket.validate("[](){}"));
        assertFalse(rotateBracket.validate("](){}["));
        assertTrue(rotateBracket.validate("(){}[]"));
        assertFalse(rotateBracket.validate("){}[]("));
        assertTrue(rotateBracket.validate("{}[]()"));
        assertFalse(rotateBracket.validate("}[](){"));
        assertFalse(rotateBracket.validate("()("));
        assertFalse(rotateBracket.validate("("));
        assertFalse(rotateBracket.validate("{{{{{{"));
        assertFalse(rotateBracket.validate("[(]){}"));
    }

    @Test
    void rotate() {
        assertEquals("](){}[" ,rotateBracket.rotate("[](){}"));
        assertEquals("(){}[]" ,rotateBracket.rotate("](){}["));
        assertEquals("){}[](" ,rotateBracket.rotate("(){}[]"));
        assertEquals("{}[]()" ,rotateBracket.rotate("){}[]("));
        assertEquals("}[](){" ,rotateBracket.rotate("{}[]()"));
        assertEquals("[](){}" ,rotateBracket.rotate("}[](){"));
    }

    @Test
    void solution() {
        assertEquals(3, rotateBracket.solution("[](){}"));
        assertEquals(2, rotateBracket.solution("}]()[{"));
        assertEquals(0, rotateBracket.solution("[)(]"));
        assertEquals(0, rotateBracket.solution("}}}"));
    }
}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//- 유효한 스킬트리인지 판별하는 메서드
// -> 스킬트리와 스킬셋을 받아 true, false를 반환
// -> 스킬트리에 들어있지 않은 값들을 전부 제거 후 같은지 판별한다.

class SkillTreeTest {
    SkillTree skillTree;

    @BeforeEach
    void setup() {
        skillTree = new SkillTree();
    }

    @Test
    void validateSkillTree() {
        assertFalse(skillTree.validateSkillTree("CBD","BACDE"));
        assertTrue(skillTree.validateSkillTree("CBD","CBADF"));
        assertTrue(skillTree.validateSkillTree("CBD","AECB"));
        assertFalse(skillTree.validateSkillTree("CBD","BDA"));
    }

    @Test
    void filter() {
        assertEquals("BCD", skillTree.filter("CBD", "BACDE"));
        assertEquals("CBD", skillTree.filter("CBD", "CBADF"));
        assertEquals("CB", skillTree.filter("CBD", "AECB"));
        assertEquals("BD", skillTree.filter("CBD", "BDA"));
    }

    @Test
    void solution() {
        assertEquals(2, skillTree.solution("CBD",new String[]{"BACDE", "CBADF", "AECB", "BDA"}));
    }
}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//- set을 이용해서 문자 가져오기

class RemoveDuplicatedTest {
    RemoveDuplicated removeDuplicated;

    @BeforeEach
    void setup() {
        removeDuplicated = new RemoveDuplicated();
    }

    @Test
    void filter() {
        assertEquals("kset", removeDuplicated.filter("ksekkset"));
    }
}

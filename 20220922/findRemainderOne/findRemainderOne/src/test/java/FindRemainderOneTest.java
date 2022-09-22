import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindRemainderOneTest {
    @Test
    void solution() {
        FindRemainderOne findRemainderOne = new FindRemainderOne();

        assertEquals(3, findRemainderOne.solution(10));

        assertEquals(11, findRemainderOne.solution(12));
    }
}

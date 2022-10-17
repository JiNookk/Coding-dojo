import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarathonTest {
    @Test
    void uncompletion() {
        // 참여자의 배열을 돌면서 완주자의 목록에 없는 사람을 제외한다.
        Marathon marathon = new Marathon();

        assertEquals("leo", marathon.solution(
                new String[]{"leo", "kiki", "eden"},
                new String[]{"kiki", "eden"}));

        assertEquals("vinko", marathon.solution(
                new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},
                new String[]{"josipa", "filipa", "marina", "nikola"}));

        assertEquals("mislav", marathon.solution(
                new String[]{"mislav", "stanko", "mislav", "ana"},
                new String[]{"stanko", "ana", "mislav"}));
    }
}


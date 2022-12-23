import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

// 입력을 저장하는 메서드 구현하기 (map으로 검증 필요)
// 출력 저장하기 (기존 맵에)
// 문자열을 받아오면 앞에서부터 잘라서 사용해야 한다.

class ZipTest {
    Zip zip;

    @BeforeEach
    void setup() {
        zip = new Zip();
    }

    @Test
    void save() {
        assertEquals(27, zip.save("KA").size());

        assertEquals(27, zip.save("K").size());
        assertEquals(27, zip.save("K").size());
        assertEquals(28, zip.save("KAA").size());
    }

    @Test
    void indexList() {
        assertEquals(List.of(11, 1, 27, 15), zip.toIndexList("KAKAO"));

        assertEquals(List.of(1, 2, 27, 29, 28, 31, 30),
                zip.toIndexList("ABABABABABABABAB"));

        assertEquals(List.of(20, 15, 2, 5, 15, 18, 14, 15, 20, 27, 29, 31, 36, 30, 32, 34),
                zip.toIndexList("TOBEORNOTTOBEORTOBEORNOT"));
    }

    @Test
    void solution() {
        assertArrayEquals(new int[]{11, 1, 27, 15}, zip.solution("KAKAO"));
        assertArrayEquals(new int[]{20, 15, 2, 5, 15, 18, 14, 15, 20, 27, 29, 31, 36, 30, 32, 34},
                zip.solution("TOBEORNOTTOBEORTOBEORNOT"));
        assertArrayEquals(new int[]{1, 2, 27, 29, 28, 31, 30},
                zip.solution("ABABABABABABABAB"));
    }
}
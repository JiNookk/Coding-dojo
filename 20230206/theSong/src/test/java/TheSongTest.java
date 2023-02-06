import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//  진행된 시간에 따라 출력된 멜로디를 구하는 함수
//  진행된 멜로디와 문자열 M 포함여부를 비교하는 함수
//  재생시간이 가장 긴 것을 선택하는 함수
//  먼저 입력된 음악을 선택하는 함수
//  조건이 없을 경우 NONE을 반환하는 함수

class TheSongTest {
    TheSong theSong;

    @BeforeEach
    void setup() {
        theSong = new TheSong();
    }

    @Test
    void getMelody() {
        assertEquals("CDEFGABCDEFGAB", theSong.getMelody("12:00,12:14,HELLO,CDEFGAB"));
        assertEquals("ABCDE", theSong.getMelody("13:00,13:05,WORLD,ABCDEF"));
    }

    @Test
    void contains() {
        assertTrue(theSong.contains("ABCDEFG", "CDEFGABCDEFGAB"));
        assertFalse(theSong.contains("ABCDEFG", "ABCDE"));
    }

    @Test
    void longest() {
//        assertEquals("12:00,12:14,HELLO,CDEFGAB",
//                theSong.longest(new String[]{
//                                "12:00,12:14,HELLO,CDEFGAB",
//                                "13:00,13:05,WORLD,ABCDEF"
//                        }
//                ));
    }

    @Test
    void latest() {
        assertEquals("12:00,12:05,HELLO,CDERAG",
                theSong.latest(new String[]{
                                "12:00,12:05,HELLO,CDERAG",
                                "13:00,13:05,WORLD,ABCDEF",
                                "15:00,15:05,HAPPY,LAICYE"
                        }
                ));
    }

    @Test
    void solution() {
        String answer = theSong.solution("ABCDEFG", new String[]{
                "12:00,12:14,HELLO,CDEFGAB",
                "13:00,13:05,WORLD,ABCDEF"
        });

        assertEquals("HELLO", answer);
    }
}
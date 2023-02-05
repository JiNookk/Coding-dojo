import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

//- 채팅방 참가 메서드 : enter -> 아이디와 이름을 맵에 추가
//- 이름 변경 메서드 : update -> 맵에 들어있는 이름을 변경
//- toMessage: record와 map을 받아서 로그로 변환하는 메서드 -> List<String>

class OpenChattingTest {
    OpenChatting openChatting;

    @BeforeEach
    void setup() {
        openChatting = new OpenChatting();
    }

    @Test
    void enter() {
        assertEquals(Map.of("uid1234","Muzi"), openChatting.enter("Enter uid1234 Muzi"));
        assertEquals(Map.of("uid1234","Muzi"), openChatting.enter("Enter uid1234 Muzi"));
        assertEquals(Map.of("uid4567","Prodo", "uid1234", "Muzi"), openChatting.enter("Enter uid4567 Prodo"));
    }

    @Test
    void update() {
        assertEquals(Map.of("uid1234","Muzi"), openChatting.enter("Enter uid1234 Muzi"));
        assertEquals(Map.of("uid4567","Prodo", "uid1234", "Muzi"), openChatting.enter("Enter uid4567 Prodo"));

        assertEquals(Map.of("uid4567","Ryan", "uid1234", "Muzi"), openChatting.update("Change uid4567 Ryan"));
    }

    @Test
    void toMessage() {
        openChatting.enter("Enter uid1234 Muzi");
        openChatting.enter("Enter uid4567 Prodo");
        openChatting.enter("Enter uid1234 Prodo");
        openChatting.update("Change uid4567 Ryan");

        assertEquals("Prodo님이 들어왔습니다.", openChatting.toMessage("Enter uid1234 Muzi", openChatting.relation));
        assertEquals("Ryan님이 들어왔습니다.", openChatting.toMessage("Enter uid4567 Prodo", openChatting.relation));
        assertEquals("Prodo님이 나갔습니다.", openChatting.toMessage("Leave uid1234", openChatting.relation));
        assertEquals("Prodo님이 들어왔습니다.", openChatting.toMessage("Enter uid1234 Prodo", openChatting.relation));
    }

    @Test
    void solution() {
        String[] expected = {"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."};

        String[] answer = openChatting.solution(new String[]{
                "Enter uid1234 Muzi",
                "Enter uid4567 Prodo",
                "Leave uid1234",
                "Enter uid1234 Prodo",
                "Change uid4567 Ryan"
        });

        assertArrayEquals(expected, answer);
    }
}
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// 참가자가 현재 몇번째 라운드에 있는지 계산하기
// 라운드를 연관짓는 메서드 만들기
// 4, 7 : 2, 4 -> 1, 2 -> 1
// 5, 15 : 3, 8 -> 2, 4 -> 1, 2 -> 1

class TournamentTest {
    Tournament tournament;

    @BeforeEach
    void setup() {
        tournament = new Tournament();
    }

    @Test
    void teamIndex() {
        assertEquals(2, tournament.teamIndex(4));
        assertEquals(2, tournament.teamIndex(3));

        assertEquals(3, tournament.teamIndex(6));
        assertEquals(3, tournament.teamIndex(5));
    }

    @Test
    void round() {
        assertEquals(3, tournament.round(4, 7));
        assertEquals(4, tournament.round(5, 15));
    }

    @Test
    void solution() {
        assertEquals(3, tournament.solution(8, 4, 7));
    }
}
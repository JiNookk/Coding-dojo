public class Tournament {
    public int teamIndex(int playerIndex) {
        return  playerIndex % 2 == 0 ?  playerIndex / 2 : playerIndex / 2 + 1;
    }

    public int round(int playerIndex1, int playerIndex2) {
        int round = 0;

        while (playerIndex1 != playerIndex2) {
            playerIndex1 = teamIndex(playerIndex1);
            playerIndex2 = teamIndex(playerIndex2);

            round += 1;
        }

        return round;
    }

    public int solution(int n, int a, int b) {
        return round(a, b);
    }
}

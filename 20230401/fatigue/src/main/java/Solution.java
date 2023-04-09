import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Player{
    private int fatigue;
    private int count = 0;

    public Player(int fatigue) {
        this.fatigue = fatigue;
    }

    public int visitDungeons(Map<Integer, Dungeon> visited) {
        for (int i = 0; i < visited.size(); i += 1) {
            Dungeon dungeon = visited.get(i);

            if (dungeon.isAvailable(this.fatigue)) {
                this.visitDungeon(dungeon);
            }
        }

        return this.count;
    }

    public void visitDungeon(Dungeon dungeon) {
        this.count += 1;
        this.fatigue -= dungeon.getFatigueCost();
    }
}

class Dungeon{
    private final int minFatigue;
    private final int fatigueCost;

    public Dungeon(int minFatigue, int fatigueCost) {
        this.minFatigue = minFatigue;
        this.fatigueCost = fatigueCost;
    }

    public boolean isAvailable(int fatigue) {
        return minFatigue <= fatigue;
    }

    public int getFatigueCost() {
        return fatigueCost;
    }
}

public class Solution {
    private Map<Integer, Dungeon> visited = new HashMap<>();
    private int k;
    private int max;

    public int solution(int k, int[][] dungeons) {
        this.k = k;
        this.max = -1000000;

        List<Dungeon> dungeonList = Arrays.stream(dungeons)
                .map(dungeon -> new Dungeon(dungeon[0], dungeon[1]))
                .collect(Collectors.toList());

        dfs(dungeonList, 0);

        return max;
    }

    // 우리가 원하는 것 : dfs가 끝날 때마다 플레이어가 초기화 되면 좋겠다.
    // dfs가 끝날때 플레이어를 생성하면 된다.
    // 일단 그러면 배열을 얻어야 한다.
    private void dfs(List<Dungeon> dungeonList, int depth) {
        if (dungeonList.size() == 0) {
            Player player = new Player(k);

            max = Math.max(max, player.visitDungeons(visited));
            return;
        }

        // 계속 0번 인덱스로 내려온다.
        // i가 아니라 depth를 map에 저장하면 된다.
        for (int i = 0; i < dungeonList.size(); i += 1) {
            List<Dungeon> copy = new ArrayList<>(dungeonList);
            Dungeon removed = copy.remove(i);

            visited.put(depth, removed);

            dfs(copy, depth + 1);
        }
    }
}

import java.util.ArrayList;
import java.util.List;

public class Cache {
    private List<String> cache = new ArrayList<>();

    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        for (String city : cities) {
            answer += executeTime(city);
            System.out.println(cache);
            updated(city, cacheSize);
        }

        return answer;
    }

    public List<String> updated(String city, int cacheSize) {
        if (isDuplicated(city)) {
            cache.remove(city.toLowerCase());
            add(city);
            return List.copyOf(cache);
        }

        add(city);

        if (cache.size() > cacheSize) {
            cache.remove(0);
        }

        return List.copyOf(cache);
    }

    public boolean add(String city) {
        return cache.add(city.toLowerCase());
    }

    public boolean isDuplicated(String city) {
        return cache.stream()
                .map(data -> data.equals(city.toLowerCase()))
                .reduce((acc, cur) -> acc || cur)
                .orElse(false);
    }

    public int executeTime(String city) {
        return isDuplicated(city.toLowerCase()) ? 1 : 5;
    }
}

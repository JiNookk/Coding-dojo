import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class OpenChatting {
    protected Map<String, String> relation = new LinkedHashMap<>();

    public String[] solution(String[] records) {
        for (String record : records) {
            String[] words = record.split(" ");
            String type = words[0];

            if (type.equals("Enter")) {
                enter(record);
            }
            if (type.equals("Change")) {
                update(record);
            }
        }

        return Arrays.stream(records)
                .filter(record -> !record.split(" ")[0].equals("Change"))
                .map(record -> toMessage(record, relation))
                .toArray(String[]::new);
    }

    public Map<String, String> enter(String record) {
        String[] words = record.split(" ");

        relation.put(words[1], words[2]);

        return relation;
    }

    public Map<String, String> update(String record) {
        String[] words = record.split(" ");

        relation.replace(words[1], words[2]);

        return relation;
    }

    public String toMessage(String record, Map<String, String> relation) {
        String[] words = record.split(" ");

        String type = words[0];
        String id = words[1];
        String name = relation.get(id);

        return type.equals("Enter") ? name + "님이 들어왔습니다." : name + "님이 나갔습니다.";
    }
}

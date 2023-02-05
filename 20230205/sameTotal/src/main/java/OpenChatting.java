import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class OpenChatting {
    protected Map<String, String> relation = new LinkedHashMap<>();

    public String[] solution(String[] records) {
        for (String record : records) {
            String type = getType(record);

            if (type.equals("Enter")) {
                enter(record);
            }

            if (type.equals("Change")) {
                update(record);
            }
        }

        return Arrays.stream(records)
                .filter(record -> !getType(record).equals("Change"))
                .map(record -> toMessage(record, relation))
                .toArray(String[]::new);
    }

    public Map<String, String> enter(String record) {
        relation.put(getId(record), getName(record));

        return relation;
    }

    public Map<String, String> update(String record) {
        relation.replace(getId(record), getName(record));

        return relation;
    }

    public String toMessage(String record, Map<String, String> relation) {
        String type = getType(record);
        String id = getId(record);
        String name = relation.get(id);

        return type.equals("Enter") ? name + "님이 들어왔습니다." : name + "님이 나갔습니다.";
    }

    private String getType(String record) {
        return getInformations(record)[0];
    }

    private String getId(String record) {
        return getInformations(record)[1];
    }

    private String getName(String record) {
        return getInformations(record)[2];
    }

    private String[] getInformations(String record) {
        return record.split(" ");
    }
}

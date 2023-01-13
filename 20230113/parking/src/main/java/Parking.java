import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Parking {
    public int parkingTime(String carNumber, List<String> records) {
        int minutes = 0;

        List<String> filteredByCarNumber = records.stream()
                .filter(record -> record.split(" ")[1].equals(carNumber))
                .map(record -> record.split(" ")[0])
                .collect(Collectors.toList());

        for (int i = 0; i < filteredByCarNumber.size(); i += 2) {
            if (i == filteredByCarNumber.size() - 1) {
                minutes += difference(filteredByCarNumber.get(i), "23:59");
                continue;
            }

            minutes += difference(filteredByCarNumber.get(i), filteredByCarNumber.get(i + 1));
        }

        return minutes;
    }

    public int difference(String in, String out) {
        if (out == null) {
            out = "23:59";
        }

        int hours = Integer.parseInt(out.split(":")[0]) - Integer.parseInt(in.split(":")[0]);
        int minutes = Integer.parseInt(out.split(":")[1]) - Integer.parseInt(in.split(":")[1]);

        return hours * 60 + minutes;
    }

    public int parkingFee(int parkingTime, int[] fees) {
        int defaultTime = fees[0];
        int defaultFee = fees[1];
        int unitTime = fees[2];
        int unitFee = fees[3];
        int time = (int) Math.ceil((double) (parkingTime - defaultTime) / unitTime);

        if (parkingTime < defaultTime) {
            return defaultFee;
        }

        return defaultFee + time * unitFee;
    }

    public int[] solution(int[] fees, String[] records) {
        List<String> recordsList = Arrays.stream(records).collect(Collectors.toList());

        Set<String> store = new HashSet<>();

        for (String record : records) {
            String carNumber = record.split(" ")[1];
            store.add(carNumber);
        }

        return store.stream()
                .sorted()
                .map(carNumber -> parkingTime(carNumber, recordsList))
                .map(parkingTime -> parkingFee(parkingTime, fees))
                .mapToInt(Integer::intValue)
                .toArray();
    }
}


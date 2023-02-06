import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Backup {
    public String solution(String melody, String[] musicInfos) {
        List<String> collect = Arrays.stream(musicInfos)
                .filter(musicInfo -> contains(melody, getMelody(musicInfo)))
                .collect(Collectors.toList());

        if (collect.size() == 1) {
            return collect.get(0).split(",")[2];
        }

        List<String> filteredByPlayTime = collect.stream()
                .filter(musicInfo -> getTime(musicInfo) == maxTime(collect))
                .collect(Collectors.toList());

        return filteredByPlayTime.get(0).split(",")[2];
//        if (filteredByPlayTime.size() == 1) {
//        }

//        List<String> filteredByPlayTime = collect.stream()
//                .filter(musicInfo -> getTime(musicInfo) == maxTime(collect))
//                .collect(Collectors.toList());
    }


    public String getMelody(String musicInfo) {
        StringBuilder melody = new StringBuilder();
        char[] notes = musicInfo.split(",")[3].toCharArray();

        int minutes = getTime(musicInfo);

        for (int i = 0; i < minutes; i += 1) {
            melody.append(notes[i % notes.length]);
        }

        return melody.toString();
    }

    public boolean contains(String melody, String extracted) {
        return extracted.contains(melody);
    }

    public Integer maxTime(List<String> musicInfos) {
        List<Integer> playTimes = musicInfos.stream()
                .map(this::getTime)
                .collect(Collectors.toList());

        return Collections.max(playTimes);
    }

    public String latest(String[] musicInfos) {
        List<Integer> playTimes = Arrays.stream(musicInfos)
                .map(musicInfo -> getMinute(musicInfo.split(",")[0]))
                .collect(Collectors.toList());

        Integer minimum = Collections.min(playTimes);
        int minIndex = playTimes.indexOf(minimum);

        return musicInfos[minIndex];
    }

    private int getTime(String musicInfo) {
        return getMinute(musicInfo.split(",")[1]) - getMinute(musicInfo.split(",")[0]);
    }

    private int getMinute(String time) {
        return Integer.parseInt(time.split(":")[0]) * 60 +
                Integer.parseInt(time.split(":")[1]);
    }
}

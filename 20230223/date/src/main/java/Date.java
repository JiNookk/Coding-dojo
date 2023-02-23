import java.util.HashMap;
import java.util.Map;

public class Date {
    private final Map<Integer, Integer> monthlyDates;

    public Date(boolean isLeapYear) {
        monthlyDates = getMonthlyDates(isLeapYear);
    }

    public int toDate(int month, int day) {
        int date = day;

        for (int i = 0; i < month - 1; i += 1) {
            date += monthlyDates.get(i + 1);
        }

        return date;
    }

    public String toDay(int month, int day) {
        int date = toDate(month, day);

        int weekday = date % 7;

        Map<Integer, String> days = Map.of(
                1, "FRI", 2, "SAT", 3, "SUN", 4, "MON", 5, "TUE", 6, "WED", 0, "THU");

        return days.get(weekday);
    }

    public Map<Integer, Integer> getMonthlyDates(boolean isLeapYear) {
        Map<Integer, Integer> monthlyDates = new HashMap<>();
        monthlyDates.put(1, 31);
        monthlyDates.put(2, isLeapYear ? 29 : 28);
        monthlyDates.put(3, 31);
        monthlyDates.put(4, 30);
        monthlyDates.put(5, 31);
        monthlyDates.put(6, 30);
        monthlyDates.put(7, 31);
        monthlyDates.put(8, 31);
        monthlyDates.put(9, 30);
        monthlyDates.put(10, 31);
        monthlyDates.put(11, 30);
        monthlyDates.put(12, 31);

        return monthlyDates;
    }
}

import java.util.Arrays;
import java.util.Objects;

public class PhoneBook {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i += 1) {
                if (isPrefix(phone_book[i], phone_book[i + 1])) {
                    return false;
                }
        }

        return true;
    }

    // 배열 개수 -> 100만개?
    // 어떻게 빠르게 찾을 수 있을까

    public boolean isPrefix(String prefix, String compare) {
        if (prefix.length() >= compare.length()) {
            return false;
        }
        String sliced = compare.substring(0, prefix.length());

        return Objects.hash(prefix) == Objects.hash(sliced);
    }
}

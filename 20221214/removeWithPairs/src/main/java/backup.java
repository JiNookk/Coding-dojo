public class backup {
    public int solution(String s) {
        String removed = removePair(s);

        return isRemoved(removed) ? 1 : 0;
    }

    public String removePair(String string) {
        for (int i = 1; i < string.length(); i += 1) {
            if (string.charAt(i) == string.charAt(i - 1)) {
                String before = string.substring(0, i - 1); // 겹치는 문자 이전 문자열
                String after = string.substring(i + 1); // 겹치는 문자 이후 문자열
                string = String.join("", before, after);

                i = 0;
            }
        }

        return string;
    }

    public boolean isRemoved(String removedString) {
        return removedString.length() == 0;
    }
}

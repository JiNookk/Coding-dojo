import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TrainingBookTest {
    // 여벌의 체육복은 ㅂㅏ로 앞과 뒤 학생에게만 체육복 빌려줄 수 있다.
    // 최대한 많은 수의 학생이 체육 수업을 들을때 수를 리턴
    @Test
    void solution() {
        TrainingBook trainingBook = new TrainingBook();

        assertEquals(5, trainingBook.solution(5, new int[]{2, 4}, new int[]{1, 3, 5}));
        assertEquals(4, trainingBook.solution(5, new int[]{2, 4}, new int[]{3}));
        assertEquals(2, trainingBook.solution(3, new int[]{3}, new int[]{1}));
        assertEquals(5, trainingBook.solution(5, new int[]{}, new int[]{}));
        assertEquals(4, trainingBook.solution(5, new int[]{1}, new int[]{}));
        assertEquals(3, trainingBook.solution(5, new int[]{1, 2, 3, 4, 5}, new int[]{1, 3, 5}));
    }

    @Test
    void reservedAndLosted() {
        TrainingBook trainingBook = new TrainingBook();

        List<Integer> lost = trainingBook.getIntegers(
                new int[]{1, 2, 3, 4, 5}, new int[]{1, 3, 5});

        assertEquals(List.of(2, 4), lost);

        List<Integer> reserved = trainingBook.getIntegers(
                new int[]{1, 3, 5}, new int[]{1, 2, 3, 4, 5});

        assertEquals(reserved, List.of());
    }
}

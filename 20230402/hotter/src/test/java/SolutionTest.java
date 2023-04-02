import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//- 최소 힙을 사용한다.
//- 루트값의 스코빌 지수가 k를 넘는지 확인한다.
//- 안넘으면 루트와 부모중 작은 값을 이용하여 스코빌 지수를 새로 계산한다.
//- 스코빌 지수가 k를 넘으면 계산횟수 리턴, 배열의 길이가 1이 되면 -> -1리턴

class SolutionTest {
    Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

//    섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
    @Test
    void calcScoville() {
        MinHeap minHeap = new MinHeap(new int[]{1, 2, 3, 9, 10, 12});

        assertEquals(5, solution.calcScoville(minHeap));
        assertEquals(3, minHeap.root());
    }

    @Test
    void solution() {
        assertEquals(2, solution.solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
    }
}
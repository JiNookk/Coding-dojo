import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FailureRateTest {
    @Test
    void failureRate() {
        FailureRate failureRate = new FailureRate();

        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        assertEquals((double) 1 / 8, failureRate.failureRate(stages, 1));
        assertEquals((double) 3 / 7, failureRate.failureRate(stages, 2));
        assertEquals((double) 2 / 4, failureRate.failureRate(stages, 3));
        assertEquals((double) 1 / 2, failureRate.failureRate(stages, 4));
        assertEquals((double) 0 / 1, failureRate.failureRate(stages, 5));
    }

    @Test
    void failureRateArray() {
        FailureRate failureRate = new FailureRate();

        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        double[] failureRateArray = failureRate.getFailureRateArray(5, stages);

        assertArrayEquals(
                new double[]{(double) 1 / 8,
                        (double) 3 / 7,
                        (double) 2 / 4,
                        (double) 1 / 2,
                        (double) 0 / 1},
                failureRateArray);
    }

    @Test
    void failureMap() {
        FailureRate failureRate = new FailureRate();

        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        double[] failureRateArray = failureRate.getFailureRateArray(5, stages);

        Map<Integer, Double> failureMap = failureRate.failureMap(failureRateArray);

        assertEquals((double) 1 / 8, failureMap.get(1));
        assertEquals((double) 3 / 7, failureMap.get(2));
        assertEquals((double) 2 / 4, failureMap.get(3));
        assertEquals((double) 1 / 2, failureMap.get(4));
        assertEquals((double) 0 / 1, failureMap.get(5));
    }

    @Test
    void solution() {
        FailureRate failureRate = new FailureRate();

        assertEquals(new int[]{3, 4, 2, 1, 5}, failureRate.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3}));
        assertEquals(new int[]{4, 1, 2, 3}, failureRate.solution(4, new int[]{4, 4, 4, 4, 4}));
    }
}

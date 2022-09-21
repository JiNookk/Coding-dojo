import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculateLackPriceTest {
    @Test
    void numberList() {
        CalculateLackPrice calculateLackPrice = new CalculateLackPrice();

        List<Integer> numberList = calculateLackPrice.getNumberList(3, 4);

        assertEquals(List.of(3, 6, 9, 12),numberList);
    }

    @Test
    void solution() {
        CalculateLackPrice calculateLackPrice = new CalculateLackPrice();

        long lackPrice = calculateLackPrice.solution(3, 20, 4);

        assertEquals(10,lackPrice);
    }


}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FruitSellerTest {
    @Test
    void getMaxProfit() {
        FruitSeller fruitSeller = new FruitSeller();

        assertEquals(0, fruitSeller.getMaxProfit(0, new int[1]));
        assertEquals(8, fruitSeller.getMaxProfit(4, new int[]{1, 2, 3, 1, 2, 3, 1}));
//        assertEquals(33, fruitSeller.getMaxProfit(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}));
    }
}
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

//  같은 의상종류를 묶는 함수 -> 해시맵으로 묶자.
//  조합을 구한다. -> 조합 길이와 의상 종류를 받으면 경우의 수를 반환하기

class CamouflageTest {
    Camouflage camouflage;

    @BeforeEach
    void setup() {
        camouflage = new Camouflage();
    }

    @Test
    void categorize() {
        String[][] clothes = new String[][]{
                {"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        Map<String, List<String>> categorized = camouflage.categorize(clothes);

        assertEquals(2, categorized.get("headgear").size());
    }


    @Test
    void combination() {
        String[][] clothes = new String[][]{
                {"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        Map<String, List<String>> categorized = camouflage.categorize(clothes);

        assertEquals(3, camouflage.combination(categorized, 1));
        assertEquals(2, camouflage.combination(categorized, 2));
    }

    @Test
    void factorial() {
        assertEquals(1, camouflage.factorial(1));
        assertEquals(6, camouflage.factorial(3));
        assertEquals(120, camouflage.factorial(5));
    }
}

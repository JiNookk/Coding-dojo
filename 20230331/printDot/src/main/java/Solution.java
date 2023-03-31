class Circle {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

//    public boolean isInCircle(int x, int y) {
//        return square(x) + square(y) <= square(radius);
//    }

    private long square(long number) {
        return number * number;
    }

    public int countPointWithXWithinCircle(int x, int k) {
        return (int) (Math.floor(Math.sqrt(square(radius) - square(x)) / k) + 1);
    }
}

public class Solution {
    public long solution(int k, int d) {
        Circle circle = new Circle(d);

        long count = 0;

        // x * k => 최대 y좌표 알아냄 -> y좌표 : 25.3, k : 5 -> 5.xxx -> 5(버림) + 1 (0)
        for (int x = 0; x <= getMaxMultiplier(k, d); x += 1) {
            count += circle.countPointWithXWithinCircle(x * k, k);
        }

        return count;
    }

    public int getMaxMultiplier(int k, int d) {
        return d / k;
    }
}


// public class Solution {
//    public int solution(int k, int d) {
//        Circle circle = new Circle(d);
//
//        int count = 0;
//        int maxMultiplier = getMaxMultiplier(k, d);
//        int maxX = maxMultiplier;
//
////        이중 포문을 어떻게 줄일까?
//        for (int y = 0; y <= maxMultiplier; y += 1) {
//            for (int x = 0; x <= maxX; x += 1) {
//                if (!circle.isInCircle(x * k, y * k)) {
//                    maxX = x - 1;
//                    break;
//                }
//                System.out.println("(" + x * k + ", " + y * k + ")");
//
//                count += 1;
//            }
//        }
//
//        return count;
//    }
//
//    public int getMaxMultiplier(int k, int d) {
//        return d / k;
//    }
//}

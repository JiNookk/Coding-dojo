import java.util.LinkedList;
import java.util.Queue;

class Bridge{
    int bridge_length;
    int maxWeight;
    Queue<Truck> trucksOnBridge = new LinkedList<>();

    public Bridge(int bridge_length, int maxWeight) {
        this.bridge_length = bridge_length;
        this.maxWeight = maxWeight;
    }

    public int enter(Queue<Truck> truckQueue, int totalWeight) {
        int outWeight = !trucksOnBridge.isEmpty() && trucksOnBridge.peek().location == bridge_length ?
                trucksOnBridge.peek().weight
                : 0;

        if (truckQueue.isEmpty() || totalWeight + truckQueue.peek().weight - outWeight > maxWeight) {
            return totalWeight;
        }

        Truck truck = truckQueue.poll();
        trucksOnBridge.add(truck);

        return totalWeight + truck.weight;
    }

    public int moveTrucks() {
        for (Truck truck : trucksOnBridge) {
            truck.move();
        }

        if (!trucksOnBridge.isEmpty() && trucksOnBridge.peek().location > bridge_length) {
            Truck truck = trucksOnBridge.poll();

            return truck.weight;
        }

        return 0;
    }
}

class Truck{
    int weight;
    int location;

    public Truck(int weight, int location) {
        this.weight = weight;
        this.location = location;
    }

    public int move() {
        location += 1;
        return location;
    }
}
//- 다리와 트럭이라는 객체 만들기
//- enter -> 트럭 입장(큐) -> 다리의 최대하중 테스트, 넘으면 큐에 못들여보냄.
//- 전체 초 반환
//- 전진 -> 큐에있는 모든 트럭 하나씩 전진
//- pass -> 큐의 peek값이 bridge_length를 넘기면 poll

public class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Truck> truckQueue = new LinkedList<>();
        Bridge bridge = new Bridge(bridge_length, weight);
        int time = 0;
        int totalWeight = 0;

        for (int truck_weight : truck_weights) {
            Truck truck = new Truck(truck_weight, 0);
            truckQueue.add(truck);
        }

        while (!(bridge.trucksOnBridge.size() == 0 && truckQueue.size() == 0)) {
            time += 1;
            totalWeight = bridge.enter(truckQueue, totalWeight);
            totalWeight -= bridge.moveTrucks();
        }

        return time;
    }
}

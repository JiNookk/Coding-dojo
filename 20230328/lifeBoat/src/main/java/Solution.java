import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class LifeBoat{
    private final int capacity;

    public LifeBoat(int capacity) {
        this.capacity = capacity;
    }

    public boolean isOverCapacity(int lowWeight, int highWeight) {
        return capacity < lowWeight + highWeight;
    }

    public List<Integer> rescue(List<Integer> people) {
        Integer minWeight = people.get(0);
        Integer maxWeight = people.get(people.size() - 1);

        return isOverCapacity(minWeight, maxWeight) || people.size() == 1
                ? people.subList(0, people.size() - 1)
                : people.subList(1, people.size() - 1);
    }

//    public List<Integer> rescue(List<Integer> people) {
//        List<Integer> copy = new ArrayList<>(people);
//
//        Integer minWeight = copy.get(0);
//        Integer maxWeight = copy.get(copy.size() - 1);
//
//        return isOverCapacity(minWeight, maxWeight) || copy.size() == 1
//                ? copy.subList(0, copy.size() - 1)
//                : copy.subList(1, copy.size() - 1);
//    }

//    public void rescue(List<Integer> people) {
//        Integer minWeight = people.get(0);
//        Integer maxWeight = people.get(people.size() - 1);
//
//        people.remove(people.size() - 1);
//
//        if (isOverCapacity(minWeight, maxWeight) || people.size() == 0) {
//            return;
//        }
//
//        people.remove(0);
//    }
}

public class Solution {
    public int solution(int[] people, int limit) {
        int count = 0;

        Arrays.sort(people);

        List<Integer> peopleList = new ArrayList<>();

        LifeBoat lifeBoat = new LifeBoat(limit);

        for (int person : people) {
            peopleList.add(person);
        }

        while (peopleList.size() != 0) {
            peopleList = lifeBoat.rescue(peopleList);
//            lifeBoat.rescue(peopleList);
            count += 1;
            System.out.println("Size: " + peopleList.size());
        }

        return count;
    }
}

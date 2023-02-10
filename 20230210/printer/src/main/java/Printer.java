import java.util.Queue;

public class Printer {
    private final Queue<Integer> queue;
    private int location;

    public Printer(Queue<Integer> queue, int location) {
        this.queue = queue;
        this.location = location;
    }

    public boolean comparePriority() {
        Integer max = queue.stream()
                .max((a, b) -> a - b)
                .get();

        return queue.peek() >= max;
    }

    public Queue<Integer> revolve() {
        Integer removed = queue.remove();
        queue.add(removed);

        revolveLocation();

        return queue;
    }

    public int revolveLocation() {
        location = location == 0 ? queue.size() - 1 : location - 1;

        return location;
    }

    public int myOrder() {
        int order = 0;

        for (int i = 0; !(location == 0 && comparePriority()); i += 1) {
            if (comparePriority()) {
                remove();

                order += 1;
                continue;
            }

            revolve();
        }

        return order + 1;
    }

    public Queue<Integer> remove() {
        queue.remove();
        revolveLocation();

        return queue;
    }
}

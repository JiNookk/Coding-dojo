import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinHeapTest {
    @Test
    void isMoreThan() {
        MinHeap minHeap = new MinHeap(new int[]{8, 4, 6});

        assertTrue(minHeap.isMoreThan(4));
        assertFalse(minHeap.isMoreThan(7));
        assertFalse(minHeap.isMoreThan(5));
    }

    @Test
    void remove() {
        MinHeap minHeap = new MinHeap(new int[]{8, 4, 6});

        assertEquals(4, minHeap.remove());
        assertEquals(6, minHeap.root());
        assertEquals(2, minHeap.size());
    }

    @Test
    void add() {
        MinHeap minHeap = new MinHeap(new int[]{8, 4, 6});

        assertEquals(3, minHeap.add(3));
        assertEquals(3, minHeap.root());
        assertEquals(4, minHeap.size());
    }
}
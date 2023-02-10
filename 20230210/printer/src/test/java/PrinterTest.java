import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

//- 가장 최근 문서와 문서 전체의 우선순위를 비교하는 함수
//- 가장 최근 문서를 맨뒤로 보내는 함수
//- 내 문서의 순서를 구하는 함수 -> 내 문서의 우선순위가 최우선이 될때까지 루프를 돌리기

class PrinterTest {
    Printer printer;
    Queue<Integer> queue;

    @Test
    void revolve() {
        queue = new LinkedList<>(List.of(1, 1, 9, 1, 1, 1));
        printer = new Printer(queue, 0);

        assertEquals(new LinkedList<>(List.of(1, 9, 1, 1, 1, 1)), printer.revolve());
        assertEquals(new LinkedList<>(List.of(9, 1, 1, 1, 1, 1)), printer.revolve());
    }

    @Test
    void comparePriority() {
        queue = new LinkedList<>(List.of(1, 1, 9, 1, 1, 1));
        printer = new Printer(queue, 0);

        assertFalse(printer.comparePriority());

        printer.revolve();
        assertFalse(printer.comparePriority());

        printer.revolve();
        assertTrue(printer.comparePriority());
    }

    @Test
    void myOrder() {
        queue = new LinkedList<>(List.of(1, 1, 9, 1, 1, 1));
        printer = new Printer(queue, 0);

        assertEquals(5, printer.myOrder());

        queue = new LinkedList<>(List.of(2, 1, 3, 2));
        printer = new Printer(queue, 2);

        assertEquals(1, printer.myOrder());
    }

    @Test
    void revolveLocation() {
        queue = new LinkedList<>(List.of(1, 1, 9, 1, 1, 1));
        printer = new Printer(queue, 0);

        assertEquals(5, printer.revolveLocation());
        assertEquals(4, printer.revolveLocation());
        assertEquals(3, printer.revolveLocation());
    }

    @Test
    void remove() {
        queue = new LinkedList<>(List.of(1, 1, 9, 1, 1, 1));
        printer = new Printer(queue, 0);

        assertEquals(new LinkedList<>(List.of(1, 9, 1, 1, 1)), printer.remove());
        assertEquals(new LinkedList<>(List.of(9, 1, 1, 1)), printer.remove());
        assertEquals(new LinkedList<>(List.of(1, 1, 1)), printer.remove());
    }
}
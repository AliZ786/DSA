package Deque;

import Deque.Deque;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DequeTest {

    @Test
    public void testAddAndRemove(){

        Deque<Integer> list = new Deque<Integer>();

        assertTrue(list.isEmpty());
        assertEquals(0,list.size());

        list.addFirst(12);
        list.addFirst(15);
        list.addFirst(16);
        list.addLast(14);
        list.addLast(22);

        assertFalse(list.isEmpty());
        assertEquals(5, list.size());

        assertEquals(16, list.peekFirst());
        assertEquals(22, list.peekLast());

        list.removeFirst();
        assertEquals(15, list.peekFirst());

        list.removeLast();
        assertEquals(3, list.size());

        list.removeFirst();
        assertEquals(12, list.peekFirst());

        list.removeLast();
        assertEquals(1, list.size());

        list.removeLast();
        assertTrue(list.isEmpty());


    }
}

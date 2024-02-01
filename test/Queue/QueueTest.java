package Queue;

import Queue.Queue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    @Test
    void testEnqueueAndDequeue() {
        Queue<Integer> queue = new Queue<Integer>();

        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        assertFalse(queue.isEmpty());
        assertEquals(3, queue.size());
        assertEquals(10, queue.peek());

        int dequeued = queue.dequeue();
        assertEquals(10, dequeued);
        assertEquals(2, queue.size());

        dequeued = queue.dequeue();
        assertEquals(20, dequeued);
        assertEquals(1, queue.size());

        dequeued = queue.dequeue();
        assertEquals(30, dequeued);
        assertEquals(0, queue.size());
        assertTrue(queue.isEmpty());
    }
}

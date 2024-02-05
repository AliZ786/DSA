package com.example.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

    @Test
    public void testLinkedListOperations() {
        LinkedList<Integer> linkedList = new LinkedList<>();

        assertTrue(linkedList.isEmpty());

        linkedList.insertAtEnd(10);
        linkedList.insertAtEnd(20);
        linkedList.insertAtBeginning(5);
        linkedList.insertAtEnd(30);

        assertFalse(linkedList.isEmpty());

        // Assert individual elements

        // Check the linked list size
        assertEquals(4, linkedList.size());

        linkedList.delete(20);

        // Check the linked list size after deletion
        assertEquals(3, linkedList.size());

        // Delete a non-existent element
        linkedList.delete(15);

        // Check the linked list size after attempting to delete a non-existent element
        assertEquals(3, linkedList.size());
    }
}

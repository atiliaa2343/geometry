package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import geometry.LinkedList;
import geometry.Rectangle;

/**
 * Unit tests for the LinkedList class.
 * 
 * This class uses JUnit 5 to test the functionality of the 
 * class, including adding, finding, and removing items.
 */
class LinkedListTest {

    /**
     * Tests the methods to ensure that an item can be added to the list and correctly
     * retrieved.
     * 
     * The test creates a linked list of rectangles, adds a rectangle to the list,
     * and verifies that the rectangle can be found.
     */

    @Test
    void shouldAddAndFindItem() {
        LinkedList<Rectangle> list = new LinkedList<>();
        Rectangle rectangle = new Rectangle(5.0, 4.0);
        list.add(rectangle);

        assertEquals(rectangle, list.find(rectangle));
    }

    /**
     * Tests the methods to ensure that an item can be removed from the list and that the
     * list no longer contains the item.
     * 
     * The test creates a linked list of rectangles, adds a rectangle, removes it,
     * and verifies that the rectangle is no longer in the list.
     */
    @Test
    void shouldRemoveItem() {
        LinkedList<Rectangle> list = new LinkedList<>();
        Rectangle rectangle = new Rectangle(5.0, 4.0);
        list.add(rectangle);
        list.remove(rectangle);

        assertNull(list.find(rectangle));
    }
}

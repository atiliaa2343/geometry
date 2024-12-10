package geometry;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple generic LinkedList implementation for storing elements.
 * 
 * This class uses a {@link java.util.ArrayList} internally to store elements
 * and provides basic operations for adding, removing, finding, and printing
 * elements. It is a lightweight wrapper around an {@link ArrayList} designed
 * for educational purposes.
 * 
 * @param <T> the type of elements stored in this list
 */ 

public class LinkedList<T> {
	/**
     * Internal list to store elements.
     */
    private List<T> items; 
    
    /**
     * Constructs an empty LinkedList.
     */

    public LinkedList() {
        this.items = new ArrayList<>();
    }
    
    /**
     * Adds an element to the list.
     * 
     * @param item the element to be added
     */
    public void add(T item) {
        items.add(item);
    }

    

    /**
     * Prints all elements in the list to the standard output.
     */
    public void printAll() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}

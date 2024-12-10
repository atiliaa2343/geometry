package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import geometry.Rectangle;
/**
 * Unit tests for the Rectangle class.
 * 
 * This class uses JUnit 5 to test the functionality of the class, including the calculation of area and perimeter.
 */
class RectangleTest {
	/**
     * Tests the method to ensure it correctly calculates
     * the area of a rectangle.
     * 
     * The test creates a rectangle with a length of 5.0 and a width of 4.0 and
     * asserts that the calculated area matches the expected value of 20.0.
     */
    @Test
    void shouldCalculateArea() {
        Rectangle rectangle = new Rectangle(5.0, 4.0);
        assertEquals(20.0, rectangle.area());
    }
    
    /**
     * Tests the method to ensure it correctly calculates the perimeter of a rectangle.
     * 
     * The test creates a rectangle with a length of 5.0 and a width of 4.0 and
     * asserts that the calculated perimeter matches the expected value of 18.0.
     */
    @Test
    void shouldCalculatePerimeter() {
        Rectangle rectangle = new Rectangle(5.0, 4.0);
        assertEquals(18.0, rectangle.perimeter());
    }
}

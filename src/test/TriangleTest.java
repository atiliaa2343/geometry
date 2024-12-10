package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import geometry.Triangle;
 
/**
 * Unit tests for the Triangle class.
 * 
 * This class uses JUnit 5 to test the functionality of the {@link Triangle}
 * class, including the calculation of area and perimeter.
 */
class TriangleTest {

	/**
     * Tests the method to ensure it correctly calculates
     * the area of a triangle.
     * 
     * The test creates a triangle with a base of 4.0, a height of 5.0, and side
     * lengths of 3.0, 4.0, and 5.0. It asserts that the calculated area matches
     * the expected value of 10.0.
     */
    @Test
    void shouldCalculateArea() {
        Triangle triangle = new Triangle(4.0, 5.0, 3.0, 4.0, 5.0);
        assertEquals(10.0, triangle.area());
    }

    /**
     * Tests the method to ensure it correctly calculates
     * the perimeter of a triangle.
     * 
     * The test creates a triangle with side lengths of 3.0, 4.0, and 5.0. It asserts
     * that the calculated perimeter matches the expected value of 12.0.
     */
    @Test
    void shouldCalculatePerimeter() {
        Triangle triangle = new Triangle(4.0, 5.0, 3.0, 4.0, 5.0);
        assertEquals(12.0, triangle.perimeter());
    }
}

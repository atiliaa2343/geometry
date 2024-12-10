package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import geometry.Circle;

/**
 * Unit tests for the Circle class.
 * 
 * This class uses JUnit 5 to test the functionality of the 
 * class, including the calculation of area and perimeter.
 */
class CircleTest {

	/**
     * Tests the method to ensure it correctly calculates
     * the area of a circle.
     * 
     * The test creates a circle with a radius of 3.0 and asserts that the
     * calculated area matches the expected value with a tolerance of 1e-6.
     */
    @Test
    void shouldCalculateArea() {
        Circle circle = new Circle(3.0);
        assertEquals(28.274333882308138, circle.area(), 1e-6);
    }
    
    /**
     * Tests the  method to ensure it correctly calculates
     * the perimeter (circumference) of a circle.
     * 
     * The test creates a circle with a radius of 3.0 and asserts that the
     * calculated perimeter matches the expected value with a tolerance of 1e-6.
     */

    @Test
    void shouldCalculatePerimeter() {
        Circle circle = new Circle(3.0);
        assertEquals(18.84955592153876, circle.perimeter(), 1e-6);
    }
}

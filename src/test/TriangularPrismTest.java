package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import geometry.TriangularPrism;

/**
 * Unit tests for the Triangle class.
 * 
 * This class uses JUnit 5 to test the functionality of the 
 * class, including the calculation of area and perimeter.
 */
class TriangularPrismTest {

	/**
     * Tests the method to ensure it correctly calculates
     * the area of a triangle.
     * 
     * The test creates a triangle with a base of 4.0, a height of 5.0, and side
     * lengths of 3.0, 4.0, and 5.0. It asserts that the calculated area matches
     * the expected value of 10.0.
     */
    @Test
    void shouldCalculateVolume() {
        TriangularPrism prism = new TriangularPrism(3.0, 4.0, 5.0);
        assertEquals(30.0, prism.volume());
    }

    /**
     * Tests the method to ensure it correctly calculates
     * the perimeter of a triangle.
     * 
     * The test creates a triangle with side lengths of 3.0, 4.0, and 5.0. It asserts
     * that the calculated perimeter matches the expected value of 12.0.
     */
    @Test
    void shouldCalculateSurfaceArea() {
        TriangularPrism prism = new TriangularPrism(3.0, 4.0, 5.0);
        assertEquals(55.0, prism.surfaceArea());
    }
}

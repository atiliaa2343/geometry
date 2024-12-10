package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import geometry.Sphere;

/**
 * Unit tests for the Sphere class.
 * 
 * This class uses JUnit 5 to test the functionality of the {@link Sphere}
 * class, including the calculation of volume and surface area.
 */
class SphereTest { 
	
	
	/**
     * Tests the method to ensure it correctly calculates
     * the volume of a sphere.
     * 
     * The test creates a sphere with a radius of 3.0 and asserts that the
     * calculated volume matches the expected value of approximately 113.0973,
     * with a tolerance of 1e-6.
     */
    @Test
    void shouldCalculateVolume() {
        Sphere sphere = new Sphere(3.0);
        assertEquals(113.09733552923254, sphere.volume(), 1e-6);
    }

    /**
     * Tests the method to ensure it correctly calculates
     * the surface area of a sphere.
     * 
     * The test creates a sphere with a radius of 3.0 and asserts that the
     * calculated surface area matches the expected value of approximately 113.0973,
     * with a tolerance of 1e-6.
     */

    @Test
    void shouldCalculateSurfaceArea() {
        Sphere sphere = new Sphere(3.0);
        assertEquals(113.09733552923255, sphere.surfaceArea(), 1e-6);
    }
}

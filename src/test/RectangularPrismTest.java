package test;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import geometry.RectangularPrism;

/**
 * Unit tests for the RectangularPrism class.
 * 
 * This class uses JUnit 5 to test the functionality of the class, including volume and surface area calculations, as well as the ability to create instances.
 */
class RectangularPrismTest { 
	
	/**
    * Tests the creation of a cube .
    * 
    * The test verifies that a object can be successfully
    * created with equal dimensions for length, width, and height.
    */
	@Test
	void should_create_cube() {
		RectangularPrism _ = new RectangularPrism(10.0, 10.0, 10.0);
	}
	
	/**
     * Tests the method to ensure it correctly calculates
     * the volume of a cube with dimensions 1.0 x 1.0 x 1.0.
     * 
     * The expected volume is 1.0.
     */
	@Test
	void should_have_volume_one() {
		RectangularPrism cube = new RectangularPrism(1.0, 1.0, 1.0);
		assert(cube.volume() == 1.0);
	}
	
	/**
     * Tests the method to ensure it correctly calculates
     * the surface area of a cube with dimensions 1.0 x 1.0 x 1.0.
     * 
     * The expected surface area is 6.0.
     */

	
	@Test
	void should_calculate_surface_area() {
		RectangularPrism cube = new RectangularPrism(1.0, 1.0, 1.0);
		assert(cube.surfaceArea() == 6.0);
	}

}

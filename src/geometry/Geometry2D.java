package geometry;

/**
 * Abstract class representing 2D geometrical shapes.
 * 
 * This class serves as a base for all two-dimensional shapes. It defines the
 * basic operations that all 2D shapes must implement, specifically the
 * calculation of area and perimeter.
 */
public abstract class Geometry2D { 
	
	/**
     * Calculates the area of the 2D shape.
     * 
     * @return the area of the shape
     */
	abstract double area(); 
	
	/**
     * Calculates the perimeter of the 2D shape.
     * 
     * @return the perimeter of the shape
     */
	abstract double perimeter();
}

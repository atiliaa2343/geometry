package geometry;

/**
 * Abstract class representing 3D geometrical shapes.
 * 
 * This class serves as a base for all three-dimensional shapes. It defines the
 * basic operations that all 3D shapes must implement, specifically the
 * calculation of volume and surface area.
 */
public abstract class Geometry3D { 
	
	/**
     * Calculates the volume of the 3D shape.
     * 
     * @return the volume of the shape
     */
	abstract double volume(); 
	
	/**
     * Calculates the surface area of the 3D shape.
     * 
     * @return the surface area of the shape
     */
	abstract double surfaceArea();
}

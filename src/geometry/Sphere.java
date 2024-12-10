package geometry;

/**
 * Represents a Sphere, a 3D geometric shape.
 * 
 * This class extends the abstract class {@link Geometry3D} and provides
 * concrete implementations for calculating the volume and surface area of a
 * sphere.
 */
public class Sphere extends Geometry3D {
	
	/**
     * The radius of the sphere.
     */
    private double radius;

    /**
     * Constructs a Sphere with the given radius.
     * 
     * @param radius the radius of the sphere
     */

    public Sphere(double radius) {
        this.radius = radius;
    } 
    
    /**
     * Calculates the volume of the sphere.
     * 
     * The formula for the volume of a sphere is:
     * \[
     * V = (4 / 3.0) * Math.PI * Math.pow(radius, 3)
     * \]
     * 
     * @return the volume of the sphere
     */

    @Override
	public
    double volume() {
        return (4 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
    
    /**
     * Calculates the surface area of the sphere.
     * 
     * The formula for the surface area of a sphere is:
     * \[
     * A = 4 \pi r^2
     * \]
     * 
     * @return the surface area of the sphere
     */
    @Override
	public
    double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
    
    
    /**
     * Returns a string representation of the Sphere object.
     * 
     * @return a string in the format "Sphere [radius=...]"
     */

    @Override
    public String toString() {
        return "Sphere [radius=" + radius + "]";
    }
}

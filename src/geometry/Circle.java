package geometry;

/**
 * Represents a Circle, a 2D geometric shape.
 * 
 * This class extends the abstract class {@link Geometry2D} and provides concrete
 * implementations for calculating the area and perimeter of a circle.
 */
public class Circle extends Geometry2D { 
	
	/**
     * The radius of the circle.
     */
    private double radius;
    
    /**
     * Constructs a Circle with the given radius.
     * 
     * @param radius the radius of the circle
     */
    public Circle(double radius) {
        this.radius = radius;
    } 
    
    /**
     * Calculates the area of the circle.
     * 
     * @return the area of the circle
     */
    @Override
	public
    double area() {
        return Math.PI * radius * radius;
    }
    
    /**
     * Calculates the perimeter (circumference) of the circle.
     * 
     * @return the perimeter of the circle
     */

    @Override
	public
    double perimeter() {
        return 2 * Math.PI * radius;
    } 
    
    /**
     * Returns a string representation of the Circle object.
     * 
     * @return a string in the format "Circle [radius=...]"
     */

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
}

package geometry;

/**
 * Represents a Rectangle, a 2D geometric shape.
 * 
 * This class extends the abstract class {@link Geometry2D} and provides concrete
 * implementations for calculating the area and perimeter of a rectangle.
 */
public class Rectangle extends Geometry2D {
	/**
     * The length of the rectangle.
     */

	private double length;
	/**
     * The width of the rectangle.
     */
    private double width;

    /**
     * Constructs a Rectangle with the given length and width.
     * 
     * @param length the length of the rectangle
     * @param width  the width of the rectangle
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    } 
    
    /**
     * Calculates the area of the rectangle.
     * 
     * @return the area of the rectangle
     */
    @Override
	public
    double area() {
        return length * width;
    }

    /**
     * Calculates the perimeter of the rectangle.
     * 
     * @return the perimeter of the rectangle
     */
    @Override
	public
    double perimeter() {
        return 2 * (length + width);
    }
    
    /**
     * Returns a string representation of the Rectangle object.
     * 
     * @return a string in the format "Rectangle [length=..., width=...]"
     */
    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + "]";
    }
}

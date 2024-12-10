package geometry;

/**
 * Represents a Triangle, a 2D geometric shape.
 * 
 * This class extends the abstract class {@link Geometry2D} and provides
 * concrete implementations for calculating the area and perimeter of a
 * triangle.
 */
public class Triangle extends Geometry2D {
	
	/**
     * The base of the triangle.
     */
    private double base;
    
    /**
     * The height of the triangle, measured perpendicular to the base.
     */
    private double height; 
    /**
     * The length of side A of the triangle, the length of side B of the triangle, the length of side C of the triangle.
     */
    private double sideA, sideB, sideC;

    /**
     * Constructs a Triangle with the given dimensions.
     * 
     * @param base   the base of the triangle
     * @param height the height of the triangle
     * @param sideA  the length of side A of the triangle
     * @param sideB  the length of side B of the triangle
     * @param sideC  the length of side C of the triangle
     */
    public Triangle(double base, double height, double sideA, double sideB, double sideC) {
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    /**
     * Calculates the area of the triangle.
     * 
     * The formula for the area of a triangle is:
     * \[
     * A = 0.5 * base * height
     * ]
     * @return the area of the triangle
     */
    @Override
	public
    double area() {
        return 0.5 * base * height;
    } 
    /**
     * Calculates the perimeter of the triangle.
     * 
     * The formula for the perimeter of a triangle is:
     * \[
     * P = sideA + sideB + sideC
     * \]
     * 
     * @return the perimeter of the triangle
     */

    @Override
	public
    double perimeter() {
        return sideA + sideB + sideC;
    } 
    
    /**
     * Returns a string representation of the Triangle object.
     * 
     * @return a string in the format "Triangle [base=..., height=...]"
     */


    @Override
    public String toString() {
        return "Triangle [base=" + base + ", height=" + height + "]";
    }
}

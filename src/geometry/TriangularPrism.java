package geometry;

/**
 * Represents a Triangular Prism, a 3D geometric shape.
 * 
 * This class extends the abstract class {@link Geometry3D} and provides
 * concrete implementations for calculating the volume and surface area of a
 * triangular prism.
 */
public class TriangularPrism extends Geometry3D {
	/**
     * The base of the triangular face of the prism.
     */
	private double base; 
	/**
     * The height of the triangular face of the prism.
     */
    private double height;
    /**
     * The length (depth) of the prism.
     */
    private double length;

    /**
     * Constructs a TriangularPrism with the given dimensions.
     * 
     * @param base   the base of the triangular face
     * @param height the height of the triangular face
     * @param length the length of the prism
     */
    public TriangularPrism(double base, double height, double length) {
        this.base = base;
        this.height = height;
        this.length = length;
    }
    
    /**
     * Calculates the volume of the triangular prism.
     * 
     * The formula for the volume of a triangular prism is:
     * \[
     * V = 0.5 * base * height * length
     * \]
     * 
     * @return the volume of the triangular prism
     */

    @Override
	public
    double volume() {
        return 0.5 * base * height * length;
    } 
    
    /**
     * Calculates the surface area of the triangular prism.
     * 
     * The surface area is calculated approximately as:
     * 
     * Surface Area = length * (base + height) + 2 * (0.5 * base * height)
     * 
     * 
     * @return the surface area of the triangular prism
     */

    @Override
	public
    double surfaceArea() {
        // Simplified surface area calculation
        return length * (base + height) + 2 * (0.5 * base * height);
    }

    @Override
    public String toString() {
        return "TriangularPrism [base=" + base + ", height=" + height + ", length=" + length + "]";
    }
}

/**
 * Method AreaCircle
 *
 * Calculate the area of a circle.
 *
 * Method:
 * double areaCircle(double radius)
 *
 * Description:
 * Calculates the area of a circle based on its radius using the formula: pi * radius^2.
 *
 * Parameters:
 * @param radius The radius of the circle.
 *
 * Returns:
 * The area of the circle.
 *
 * Example Usage:
 * double area = areaCircle(5); // Returns approximately 78.54 (pi * 5^2)
 *
 * @author Ramesh Pandey <ramesh.pandey@tuni.fi>
 * @version 2024.0226
 * @since 17.0
 */
class Area {

    /**
     * Calculates the area of a circle.
     *
     * @param radius The radius of the circle.
     * @return The area of the circle.
     */
    public static double areaCircle(double radius) {
        return Math.PI * radius * radius;
    }

    /**
     * Prints main method to demonstrate the usage of the areaCircle method.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        double radius = 5;
        double area = areaCircle(radius);
        System.out.println("Area of the circle: " + area);
    }
}

/**
 * Calculate Cone
 *
 * Calculate triangular cone's volume from radius and height.
 * Display result according to radius and height.
 *
 * volume = (1/3) * PI * r^2 * h
 *
 * [1] Triangular cone
 *
 * @author Ramesh Pandey <ramesh.pandey@tuni.fi>
 * @version 2024.0210
 * @since 17.0
 */
class CalculateCone {

    /**
     * Calculates the volume of a triangular cone.
     *
     * @param radius Radius of the cone.
     * @param height Height of the cone.
     * @return Volume of the cone.
     */
    public static double calculateVolume(double radius, double height) {
        return (1.0/3.0) * Math.PI * Math.pow(radius, 2) * height;
    }

    /**
     * Prints main method to execute the program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        double radius = 5; // Example radius
        double height = 10; // Example height


        System.out.println("radius: " + radius);
        System.out.println("height: " + height);
        System.out.printf("volume: %.2f\n", calculateVolume(radius, height));
    }
}

/**
 * Calculate Hypotenuse
 *
 * Write a program to calculate the hypotenuse (C) from the Pythagorean theorem.
 * Use the Math library for power and square root operations.
 *
 * c^2 = a^2 + b^2
 *
 * [1] Pythagorean theorem
 * [2] Math library
 *
 * @author Ramesh Pandey <ramesh.pandey@tuni.fi>
 * @version 2024.0209
 * @since 17.0
 */
import java.lang.Math;

class CalculateHypotenuse {
    
    /**
     * Calculates the hypotenuse (C) from the given sides.
     *
     * @param a Length of side a.
     * @param b Length of side b.
     * @return Length of the hypotenuse c.
     */
    public static double calculateHypotenuse(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    /**
     * Executes the Main method of the program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        double sideA = 3; // Example length of side a
        double sideB = 4; // Example length of side b


        System.out.println("a: " + sideA);
        System.out.println("b: " + sideB);
        System.out.printf("c: %.2f\n", calculateHypotenuse(sideA, sideB));
    }
}

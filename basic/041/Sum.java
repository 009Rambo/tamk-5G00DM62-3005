/**
 * Method Sum
 *
 * Calculate arithmetic sum.
 *
 * Method:
 * int sum(int n)
 *
 * Description:
 * Calculates the arithmetic sum from 1 to the specified upper limit n.
 *
 * Parameters:
 * @param n The upper limit of the sum.
 *
 * Returns:
 * The arithmetic sum from 1 to n.
 *
 * Example Usage:
 * int total = sum(10); // Returns 55 (1 + 2 + 3 + ... + 10)
 *
 * @author Ramesh Pandey <ramesh.pandey@tuni.fi>
 * @version 2024.0226
 * @since 17.0
 */
class SumMethod {

    /**
     * Calculates the arithmetic sum from 1 to the specified upper limit n.
     *
     * @param n The upper limit of the sum.
     * @return The arithmetic sum from 1 to n.
     */
    public static int sum(int n) {
        return n * (n + 1) / 2;
    }

    /**
     * Prints main method to demonstrate the usage of the sum method.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int total = sum(10); // Calculate sum from 1 to 10
        System.out.println("Sum from 1 to 10: " + total);
    }
}

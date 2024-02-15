
/**
 * If Choices
 *
 * Write a program to decide the order of three values.
 * The program must work even if any of the values are changed.
 *
 * @author Ramesh Pandey <ramesh.pandey@tuni.fi>
 * @version 2024.0210
 * @since 17.0
 */
class Choices {

    /**
     * Determines the order of three values and prints the result.
     *
     * @param a The first value.
     * @param b The second value.
     * @param c The third value.
     */
    public static void decideOrder(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println(a + " is the biggest");

            if (b >= c) {
                System.out.println(c + " is in the middle");
                System.out.println(b + " is the smallest");
            } else {
                System.out.println(b + " is in the middle");
                System.out.println(c + " is the smallest");
            }
        } else if (b >= a && b >= c) {
            System.out.println(b + " is the biggest");

            if (a >= c) {
                System.out.println(c + " is in the middle");
                System.out.println(a + " is the smallest");
            } else {
                System.out.println(a + " is in the middle");
                System.out.println(c + " is the smallest");
            }
        } else {
            System.out.println(c + " is the biggest");

            if (a >= b) {
                System.out.println(b + " is in the middle");
                System.out.println(a + " is the smallest");
            } else {
                System.out.println(a + " is in the middle");
                System.out.println(b + " is the smallest");
            }
        }
    }

    /**
     * Prints main method to execute the program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // These values can be changed
        int a = 15;
        int b = 4;
        int c = 7;

        decideOrder(a, b, c);
    }
}

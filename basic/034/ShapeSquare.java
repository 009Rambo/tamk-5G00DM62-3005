/**
 * Loop Shape Square
 *
 * Display a square to the screen based on defined SIZE using nested loops.
 *
 * Variables:
 * int SIZE = 4;
 *
 * Output format:
 * Output is:
 * A square with 'x' characters based on the specified size.
 *
 * Examples:
 * For SIZE = 2:
 * xx
 * xx
 *
 * For SIZE = 3:
 * xxx
 * xxx
 * xxx
 *
 * For SIZE = 4:
 * xxxx
 * xxxx
 * xxxx
 * xxxx
 *
 * @author Ramesh Pandey <ramesh.pandey@tuni.fi>
 * @version 2024.0226
 * @since 17.0
 */
class ShapeSquare {

    /**
     * Displays a square to the screen based on defined SIZE.
     *
     * @param size The size of the square.
     */
    public static void displaySquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }

    /**
     * Prints main method to execute the program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int SIZE = 4;
        displaySquare(SIZE);
    }
}

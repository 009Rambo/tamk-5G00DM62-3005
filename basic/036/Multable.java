/**
 * Loop Multiplication Table
 *
 * Display a multiplication table with evenly spaced
 * formatting based on the specified size.
 *
 * Variables:
 * int size = 9;
 *
 * Output format:
 * Output is:
 * The multiplication table with evenly spaced formatting.
 *
 * @author Ramesh Pandey <ramesh.pandey@tuni.fi>
 * @version 2024.0226
 * @since 17.0
 */
class LoopMultiplicationTable {

    /**
     * Displays a multiplication table with evenly spaced formatting based on the specified size.
     *
     *
     * @param size The size of the multiplication table.
     */
    public static void displayMultiplicationTable(int size) {
        // Print the header row
        System.out.print("   * |");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        // Print the separator line
        System.out.print("-----+");
        for (int i = 1; i <= size; i++) {
            System.out.print("----");
        }
        System.out.println();
        // Print the multiplication table rows
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d |", i);
            for (int j = 1; j <= size; j++) {
                System.out.printf("%4d", i * j);
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
        int size = 9;
        displayMultiplicationTable(size);
    }
}

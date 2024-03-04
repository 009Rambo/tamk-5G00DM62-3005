/**
 * Loop Shape Arrow
 *
 * Display the specified pattern using nested loops.
 *
 * Variables:
 * int size = 5;
 * char character = '*';
 *
 * Output format:
 * Output is:
 * The specified pattern with configurable size and character.
 *
 * @author Ramesh Pandey <ramesh.pandey@tuni.fi>
 * @version 2024.0226
 * @since 17.0
 */
class ShapeArrow {

    /**
     * Displays the specified pattern using nested loops.
     *
     * @param size      The size of the arrow.
     * @param character The character to use for the pattern.
     */
    public static void displayArrow(int size, char character) {
        for (int i = 0; i < size; i++) {
            // Spaces before the first character
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            // Characters in the row
            for (int k = i; k < size; k++) {
                System.out.print(character + " ");
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
        int size = 5;
        char character = '*';
        displayArrow(size, character);
    }
}

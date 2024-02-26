/**
 * Loop Underline
 *
 * Draw an underline below a string.
 *
 * Variables:
 * String str = "This is a test";
 *
 * Output format:
 * Output is:
 * The input string followed by a line of dashes of the same length.
 *
 * @author Ramesh Pandey <ramesh.pandey@tuni.fi>
 * @version 2024.0226
 * @since 17.0
 */
class LoopUnderline {

    /**
     * Draws an underline below a string.
     *
     * @param str The string to draw underline below.
     */
    public static void drawUnderline(String str) {
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    /**
     * Prints main method to execute the program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        String str = "This is a test";
        drawUnderline(str);
    }
}

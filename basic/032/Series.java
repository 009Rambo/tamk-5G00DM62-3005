/**
 * Loop Series
 *
 * Display 10-based column numbers to the screen with configurable length.
 *
 * Variables:
 * int length = 25;
 *
 * Output format:
 * Output is:
 * "123456789 " repeated until the length and then trimmed.
 *
 * @author Ramesh Pandey <ramesh.pandey@tuni.fi>
 * @version 2024.0226
 * @since 17.0
 */
class LoopSeries {

    /**
     * Displays 10-based column numbers with configurable length.
     *
     * @param length Length of the display.
     */
    public static void displaySeries(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= length; i++) {
            sb.append(i % 10);
            if (i % 10 == 0) {
                sb.append(" ");
            }
        }
        System.out.println(sb.toString().trim());
    }

    /**
     * Prints main method to execute the program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int length = 25;
        displaySeries(length);
    }
}

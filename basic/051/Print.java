/**
 * Array Print
 *
 * Display values in an array in reverse order.
 *
 * Variables:
 * int array[] = {0, 1, 2, 3, 4, 5};
 *
 * Output format:
 * Displays the array elements in reverse order.
 *
 * @author Ramesh Pandey <ramesh.pandey@tuni.fi>
 * @version 2024.0226
 * @since 17.0
 */
class Print {

    /**
     * Prints main method to display array values in reverse order.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int array[] = {0, 1, 2, 3, 4, 5};

        System.out.print("Display: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

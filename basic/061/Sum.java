/**
 * Method Array Sum
 *
 * Calculate the sum of an integer array.
 *
 * Method:
 * int sum(int[], int)
 *
 * Description:
 * Calculates the sum of the elements in the integer array.
 *
 * Parameters:
 * - int[] arr: The integer array.
 * - int length: The length of the array.
 *
 * Returns:
 * The sum of the elements in the array.
 *
 * Example Usage:
 * int length = 3;
 * int[] array = {3, 1, 2};
 * int sum = sum(array, length); // sum = 6
 *
 * @author Ramesh Pandey <ramesh.pandey@tuni.fi>
 * @version 2024.0226
 * @since 17.0
 */
class Sum {

    /**
     * This is main method to demonstrate the usage of the sum method.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int length = 3;
        int[] array = {3, 1, 2};
        int sum = sum(array, length);
        System.out.println("Sum: " + sum); // Output: Sum: 6
    }

    /**
     * Calculates the sum of an integer array.
     *
     * @param arr    The integer array.
     * @param length The length of the array.
     * @return The sum of the elements in the array.
     */
    public static int sum(int[] arr, int length) {
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}

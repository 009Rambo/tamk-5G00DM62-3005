/**
 * Method Array Average
 *
 * Calculate the average of an integer array.
 *
 * Method:
 * double average(int[], int)
 *
 * Description:
 * Calculates the average of the elements in the integer array.
 *
 * Parameters:
 * - int[] arr: The integer array.
 * - int length: The length of the array.
 *
 * Returns:
 * The average of the elements in the array.
 *
 * Example Usage:
 * int length = 3;
 * int[] array = {3, 1, 2};
 * double average = average(array, length); // average = 2.0
 *
 * @author Ramesh Pandey <ramesh.pandey@tuni.fi>
 * @version 2024.0226
 * @since 17.0
 */
class Average {

    /**
     * This is a main method to demonstrate the usage of the average method.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int length = 3;
        int[] array = {3, 1, 2};
        double average = average(array, length);
        System.out.println("Average: " + average); // Output: Average: 2.0
    }

    /**
     * Calculates the average of an integer array.
     *
     * @param arr    The integer array.
     * @param length The length of the array.
     * @return The average of the elements in the array.
     */
    public static double average(int[] arr, int length) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / length;
    }
}

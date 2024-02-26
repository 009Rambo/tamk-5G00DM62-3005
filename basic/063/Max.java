/**
 * Method Array Max
 *
 * Find the maximum value of an integer array.
 *
 * Method:
 * int max(int[], int)
 *
 * Description:
 * Finds the maximum value among the elements in the integer array.
 *
 * Parameters:
 * - int[] arr: The integer array.
 * - int length: The length of the array.
 *
 * Returns:
 * The maximum value among the elements in the array.
 *
 * Example Usage:
 * int length = 3;
 * int[] array = {3, 1, 2};
 * int max = max(array, length); // max = 3
 *
 * @author Ramesh Pandey <ramesh.pandey@tuni.fi>
 * @version 2024.0226
 * @since 17.0
 */
class ArrayMaxMethod {

    /**
     * This is main method to demonstrate the usage of the max method.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int length = 3;
        int[] array = {3, 1, 2};
        int max = max(array, length);
        System.out.println("Maximum value: " + max); // Output: Maximum value: 3
    }

    /**
     * Finds the maximum value of an integer array.
     *
     * @param arr    The integer array.
     * @param length The length of the array.
     * @return The maximum value among the elements in the array.
     */
    public static int max(int[] arr, int length) {
        int max = arr[0];
        for (int i = 1; i < length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

/**
 * Method Array Min
 *
 * Find the minimum value of an integer array.
 *
 * Method:
 * int min(int[], int)
 *
 * Description:
 * Finds the minimum value among the elements in the integer array.
 *
 * Parameters:
 * - int[] arr: The integer array.
 * - int length: The length of the array.
 *
 * Returns:
 * The minimum value among the elements in the array.
 *
 * Example Usage:
 * int length = 3;
 * int[] array = {3, 1, 2};
 * int min = min(array, length); // min = 1
 *
 * @author Ramesh Pandey <ramesh.pandey@tuni.fi>
 * @version 2024.0226
 * @since 17.0
 */
class ArrayMinMethod {

    /**
     * This is a main method to demonstrate the usage of the min method.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int length = 3;
        int[] array = {3, 1, 2};
        int min = min(array, length);
        System.out.println("Minimum value: " + min); // Output: Minimum value: 1
    }

    /**
     * Finds the minimum value of an integer array.
     *
     * @param arr    The integer array.
     * @param length The length of the array.
     * @return The minimum value among the elements in the array.
     */
    public static int min(int[] arr, int length) {
        int min = arr[0];
        for (int i = 1; i < length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}

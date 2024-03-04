/**
 * Method Array Find
 *
 * Find the first value in a range within an integer array.
 *
 * Method:
 * int find(int[], int, int, int, int)
 *
 * Description:
 * Finds the first value within the specified range (inclusive) in the integer array.
 * If the value is not found, returns a predefined value.
 *
 * Parameters:
 * - int[] arr: The integer array.
 * - int length: The length of the array.
 * - int from: The lower bound of the range.
 * - int to: The upper bound of the range.
 * - int notFound: The value to return if the value is not found.
 *
 * Returns:
 * The first value within the range if found, otherwise the specified notFound value.
 *
 * Example Usage:
 * int length = 3;
 * int[] array = {3, 1, 2};
 * int from = 2;
 * int to = 10;
 * final int NOT_FOUND = -1;
 * int value = find(array, length, from, to, NOT_FOUND); // value = 3
 *
 * @author Ramesh Pandey <ramesh.pandey@tuni.fi>
 * @version 2024.0226
 * @since 17.0
 */
class Find {

    /**
     * This is a main method to demonstrate the usage of the find method.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int length = 3;
        int[] array = {3, 1, 2};
        int from = 2;
        int to = 10;
        final int NOT_FOUND = -1;
        int value = find(array, length, from, to, NOT_FOUND);
        System.out.println("Value found: " + value); // Output: Value found: 3
    }

    /**
     * Finds the first value within a range in an integer array.
     *
     * @param arr       The integer array.
     * @param length    The length of the array.
     * @param from      The lower bound of the range.
     * @param to        The upper bound of the range.
     * @param notFound  The value to return if the value is not found.
     * @return The first value within the range if found, otherwise the specified notFound value.
     */
    public static int find(int[] arr, int length, int from, int to, int notFound) {
        for (int i = 0; i < length; i++) {
            if (arr[i] >= from && arr[i] <= to) {
                return arr[i];
            }
        }
        return notFound;
    }
}

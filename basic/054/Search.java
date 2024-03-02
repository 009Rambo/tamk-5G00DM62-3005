import java.util.Arrays;

/**
 * Array Search
 *
 * Search values from array in a specified range and display the values found.
 *
 * Variables:
 * int array[] = {-3, -2, -1, 0, 1, 2, 3};
 * int min = -1;
 * int max = 2;
 *
 * Output format:
 * Display the values from the array within the specified range.
 *
 * Example Usage:
 * int array[] = {-3, -2, -1, 0, 1, 2, 3};
 * int min = -1;
 * int max = 2;
 * displayInRange(array, min, max);
 *
 * @author Ramesh Pandey <ramesh.pandey@tuni.fi>
 * @version 2024.0226
 * @since 17.0
 */
class ArraySearch {

    /**
     * This is main method to search values from array in specified range and display the values found.
     *
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int array[] = {-3, -2, -1, 0, 1, 2, 3};
        int min = -1;
        int max = 2;
        displayInRange(array, min, max);
    }

    /**
     * Searches values from array in a specified range and display the values found.
     *
     * @param array The array to search.
     * @param min   The minimum value of the range.
     * @param max   The maximum value of the range.
     */
    public static void displayInRange(int[] array, int min, int max) {
        Arrays.stream(array)
                .filter(value -> value >= min && value <= max)
                .forEach(value ->
                System.out.println(value + " , "));
    }
}

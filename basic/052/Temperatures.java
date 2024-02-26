import java.util.HashSet;
import java.util.Set;

/**
 * Array Temperatures
 *
 * Store temperature values in an array and present a report with min, max, and avg temperatures.
 *
 * Variables:
 * double[] temperatures = {25.5, 26.2, 24.8, 23.7, 22.9, 27.3, 28.1, 26.8, 25.4, 24.6};
 *
 * Output format:
 * Display the minimum, maximum, and average temperatures.
 *
 * Example Usage:
 * double[] temperatures = {25.5, 26.2, 24.8, 23.7, 22.9, 27.3, 28.1, 26.8, 25.4, 24.6};
 * System.out.println("Temperatures:");
 * System.out.println("Min: " + findMin(temperatures));
 * System.out.println("Max: " + findMax(temperatures));
 * System.out.println("Avg: " + findAverage(temperatures));
 *
 * @author Ramesh Pandey <ramesh.pandey@tuni.fi>
 * @version 2024.0226
 * @since 17.0
 */
class ArrayTemperatures {

    /**
     * Prints main method to store temperature values in an array and present a report.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        double[] temperatures = {25.5, 26.2, 24.8, 23.7, 22.9, 27.3, 28.1, 26.8, 25.4, 24.6};

        System.out.println("Temperatures:");
        System.out.println("Min: " + findMin(temperatures));
        System.out.println("Max: " + findMax(temperatures));
        System.out.println("Avg: " + findAverage(temperatures));
    }

    /**
     * Finds the minimum temperature in the array.
     *
     * @param temperatures The array of temperatures.
     * @return The minimum temperature.
     */
    public static double findMin(double[] temperatures) {
        double min = temperatures[0];
        for (double temperature : temperatures) {
            if (temperature < min) {
                min = temperature;
            }
        }
        return min;
    }

    /**
     * Finds the maximum temperature in the array.
     *
     * @param temperatures The array of temperatures.
     * @return The maximum temperature.
     */
    public static double findMax(double[] temperatures) {
        double max = temperatures[0];
        for (double temperature : temperatures) {
            if (temperature > max) {
                max = temperature;
            }
        }
        return max;
    }

    /**
     * Finds the average temperature in the array.
     *
     * @param temperatures The array of temperatures.
     * @return The average temperature.
     */
    public static double findAverage(double[] temperatures) {
        double sum = 0;
        for (double temperature : temperatures) {
            sum += temperature;
        }
        return sum / temperatures.length;
    }
}

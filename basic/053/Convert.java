/**
 * Array Convert
 *
 * Convert array of inches to an array of centimeters and display the conversions.
 *
 * Variables:
 * double inches[] = {1, 2, 3};
 * double centimeters[] = new double[3];
 *
 * Output format:
 * Display the conversions from inches to centimeters.
 *
 * Example Usage:
 * double inches[] = {1, 2, 3};
 * double centimeters[] = new double[3];
 * convertToCentimeters(inches, centimeters);
 * displayConversions(inches, centimeters);
 *
 * @author Ramesh Pandey <ramesh.pandey@tuni.fi>
 * @version 2024.0226
 * @since 17.0
 */
class ArrayConvert {

    /**
     * This is Main method to convert inches to centimeters and display the conversions.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        double inches[] = {1, 2, 3};
        double centimeters[] = new double[3];
        convertToCentimeters(inches, centimeters);
        displayConversions(inches, centimeters);
    }

    /**
     * Converts inches to centimeters.
     *
     * @param inches      The array of inches.
     * @param centimeters The array to store the converted centimeter values.
     */
    public static void convertToCentimeters(double[] inches, double[] centimeters) {
        for (int i = 0; i < inches.length; i++) {
            centimeters[i] = inches[i] * 2.54;
        }
    }

    /**
     * Displays the conversions from inches to centimeters.
     *
     * @param inches      The array of inches.
     * @param centimeters The array of centimeters.
     */
    public static void displayConversions(double[] inches, double[] centimeters) {
        for (int i = 0; i < inches.length; i++) {
            System.out.println(inches[i] + " in = " + centimeters[i] + " cm");
        }
    }
}

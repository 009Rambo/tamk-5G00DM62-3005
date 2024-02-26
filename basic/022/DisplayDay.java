/**
 * Display Day
 *
 * Based on DAY value, display its name.
 * Suppose that the week starts from Monday.
 *
 * Constants:
 * final int MONDAY = 1;
 * ...
 *
 * Variable:
 * int today = MONDAY;
 *
 * Output format:
 * Output is:
 * "Monday" or "Tuesday" or "Wednesday" or "Thursday" or "Friday" or "Saturday" or "Sunday"
 * or "Unknown date (N)"
 *
 * @author Ramesh Pandey <ramesh.pandey@tuni.fi>
 * @version 2024.0226
 * @since 17.0
 */
class DisplayDay {

    /**
     * Get the name of the day based on its value.
     *
     * @param day Value representing the day.
     * @return Name of the day or "Unknown date (N)" if the value is not a known date.
     */
    public static String getDayName(int day) {
        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Unknown date (" + day + ")";
        }
    }

    /**
     * Main method to execute the program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        final int MONDAY = 1; // Monday constant
        int today = MONDAY; // Change this value to test different days

        System.out.println(getDayName(today));
    }
}

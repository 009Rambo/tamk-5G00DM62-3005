/**
 * Determine Weather Condition
 *
 * Determine the weather condition based on city and temperature.
 *
 * Constants:
 * final int TORONTO = 0;
 * final int MONTREAL = 1;
 * final int VANCOUVER = 2;
 *
 * Variables:
 * int city = TORONTO;
 * int temperature = -25;
 *
 * Output format:
 * Output is:
 * "Freezing" or "Ice Freezing" or "Moderate Winter" or "Ice Cold"
 *
 * Decision Table:
 * - If temperature is below -20 in Montreal, display "Freezing"
 * - If temperature is below -20 in Vancouver or Toronto, display "Ice Freezing"
 * - If temperature is above -20 in Montreal, display "Moderate Winter"
 * - If temperature is between -20..-10 in Toronto or Vancouver, display "Ice Cold"
 *
 * @author Ramesh Pandey <ramesh.pandey@tuni.fi>
 * @version 2024.0226
 * @since 17.0
 */
class Temperature {

    /**
     * Gets the weather condition based on city and temperature.
     *
     * @param city       City code (TORONTO, MONTREAL, or VANCOUVER).
     * @param temperature Temperature in Celsius.
     * @return Weather condition.
     */
    public static String getWeatherCondition(int city, int temperature) {
        if (city == 1) { // MONTREAL
            if (temperature < -20) {
                return "Freezing";
            } else {
                return "Moderate Winter";
            }
        } else if (city == 0 || city == 2) { // TORONTO or VANCOUVER
            if (temperature < -20) {
                return "Ice Freezing";
            } else if (temperature >= -20 && temperature <= -10) {
                return "Ice Cold";
            } else {
                return "Normal Winter";
            }
        } else {
            return "Invalid city";
        }
    }

    /**
     * Prints main method to execute the program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        final int TORONTO = 0;
        final int MONTREAL = 1;
        final int VANCOUVER = 2;

        int city = TORONTO;
        int temperature = -25;

        System.out.println(getWeatherCondition(city, temperature));
    }
}

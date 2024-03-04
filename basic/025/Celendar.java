/**
 * Event Scheduler
 *
 * Display events based on date and time.
 *
 * Variables:
 * String weekday = "Mon"; // Values of Mon..Fri
 * int hour = 19;
 * int minute = 0;
 *
 * Output format:
 * Output is:
 * "volleyball" or "badminton" or "gym"
 * or "No events for WEEKDAY HH:MM"
 *
 * Events:
 * - Mon 19:00-20:30: volleyball
 * - Wed 20:30-21:30: badminton
 * - Sat 10:00-11:00: gym
 *
 * @author Ramesh Pandey <ramesh.pandey@tuni.fi>
 * @version 2024.0226
 * @since 17.0
 */
class Celendar {

    /**
     * Displays event based on date and time.
     *
     * @param weekday Day of the week (Mon..Fri).
     * @param hour    Hour of the event.
     * @param minute  Minute of the event.
     */
    public static void displayEvent(String weekday, int hour, int minute) {
        if (weekday.equals("Mon") && hour == 19 && minute >= 0 && minute <= 30) {
            System.out.println("volleyball");
        } else if (weekday.equals("Wed") && hour == 20 && minute >= 30 && minute <= 30) {
            System.out.println("badminton");
        } else if (weekday.equals("Sat") && hour == 10 && minute >= 0 && minute <= 0) {
            System.out.println("gym");
        } else {
            System.out.println("No events for " + weekday + " " +
            String.format("%02d", hour) + ":" + String.format("%02d", minute));
        }
    }

    /**
     * Prints main method to execute the program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        String weekday = "Mon";
        int hour = 19;
        int minute = 0;

        displayEvent(weekday, hour, minute);
    }
}

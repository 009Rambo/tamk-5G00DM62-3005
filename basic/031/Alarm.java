/**
 * Loop Alarm
 *
 * Emulate alarm clock by counting backwards and
 * display "ALARM!" when countdown reaches 1.
 *
 * Variables:
 * int max = 10;
 *
 * Output format:
 * Output is:
 * "10, 9, 8, ..., 1, ALARM!"
 *
 * @author Ramesh Pandey <ramesh.pandey@tuni.fi>
 * @version 2024.0226
 * @since 17.0
 */
class Alarm {

    /**
     * Emulates alarm clock countdown.
     *
     * @param max Maximum countdown value.
     */
    public static void emulateAlarm(int max) {
        for (int i = max; i >= 1; i--) {
            System.out.print(i);
            if (i != 1) {
                System.out.print(", ");
            } else {
                System.out.println(", ALARM!");
            }
        }
    }

    /**
     * Prints main method to execute the program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int max = 10;
        emulateAlarm(max);
    }
}


/**
 * Program print
 *
 * Display: date, your first name, last name, and height (in cm) to the screen.
 * Store each information in a separate variable before displaying.
 *
 * The date is YYYY-MM-DD
 * Hello, I'm John Doe
 * I'm 185 cm tall
 *
 * @author Ramesh Pandey <ramesh.pandey@tuni.fi>
 * @version 2024.0209
 * @since 17.0
 */
public class Print {

    /**
     * Prints name.
     *
     * @param ch Character to use in the box.
     * @return String for name in the box.
     */
    public static String name(String ch) {
        String str = "Hello, I'm John Doe";
        return str;
    }

    /**
     * Generates a line of characters.
     *
     * More documentation..
     * More documentation..
     *
     * @param ch  Character to use.
     * @param len Length of the returned string.
     * @return String that can be drawn as a line.
     */
    public static String line(String ch, int len) {
        String str = "";

        for (int i = 0; i < len; i++)
            str += ch;
        return str;
    }

    /**
     * Prints main method to execute the program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        String ch = "*";
        String date = "YYYY-MM-DD";
        String firstName = "John";
        String lastName = "Doe";
        int heightInCm = 185;

        System.out.println("The date is " + date);
        System.out.println(name(ch));
        System.out.println("I'm " + heightInCm + " cm tall");
    }
}

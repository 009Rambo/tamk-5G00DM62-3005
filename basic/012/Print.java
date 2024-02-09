/**
 * Program to display personal information.
 *
 * @author      Ramesh Pandey <ramesh.pandey@tuni.fi>
 * @version     2024.0209
 * @since       17.0
 */

class PersonalInfo {
    /**
     * Main method to execute the program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Storing information in separate variables
        String date = "2024-02-07";
        String firstName = "John";
        String lastName = "Doe";
        int heightInCm = 185;

        // Displaying the information
        System.out.println("Date: " + date);
        System.out.println("Hello, I'm " + firstName + " " + lastName);
        System.out.println("I'm " + heightInCm + " cm tall");
    }
}

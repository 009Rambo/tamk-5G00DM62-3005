import java.util.Random;

/**
 * Method Dice
 *
 * Simulate a dice roll.
 *
 * Method:
 * int dice()
 *
 * Description:
 * Returns a random number between 1 and 6, simulating a dice roll.
 *
 * Returns:
 * A random number between 1 and 6.
 *
 * Example Usage:
 * int value = dice(); // Returns a random number between 1 and 6
 *
 * @author Ramesh Pandey <ramesh.pandey@tuni.fi>
 * @version 2024.0226
 * @since 17.0
 */
class Dice {

    /**
     * Simulates a dice roll.
     *
     * @return A random number between 1 and 6.
     */
    public static int dice() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    /**
     * Prints main method to demonstrate the usage of the dice method.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int value = dice();
        System.out.println("Dice value: " + value);
    }
}

import java.util.HashSet;
import java.util.Set;

/**
 * Method Lottery
 *
 * Generate a lottery combination of 7 unique numbers between 1 and 40.
 *
 * Method:
 * int[] lottery()
 *
 * Description:
 * Generates a lottery combination of 7 unique numbers between 1 and 40.
 *
 * Returns:
 * An array containing the 7 unique numbers for the lottery combination.
 *
 * Example Usage:
 * int[] lotteryNumbers = lottery();
 * // lotteryNumbers will contain 7 unique numbers between 1 and 40
 *
 * @author Ramesh Pandey <ramesh.pandey@tuni.fi>
 * @version 2024.0226
 * @since 17.0
 */
class Lottery {

    /**
     * Generates a lottery combination of 7 unique numbers between 1 and 40.
     *
     * @return An array containing the 7 unique numbers for the lottery combination.
     */
    public static int[] lottery() {
        Set<Integer> lotteryNumbers = new HashSet<>();
        while (lotteryNumbers.size() < 7) {
            lotteryNumbers.add(dice());
        }
        return lotteryNumbers.stream().mapToInt(Integer::intValue).toArray();
    }

    /**
     * Simulates a dice roll.
     *
     * @return A random number between 1 and 6.
     */
    public static int dice() {
        return (int) (Math.random() * 40) + 1;
    }

    /**
     * Prints main method to demonstrate the usage of the lottery method.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int[] lotteryNumbers = lottery();
        System.out.print("Lottery: ");
        for (int i = 0; i < lotteryNumbers.length; i++) {
            System.out.print(lotteryNumbers[i]);
            if (i < lotteryNumbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

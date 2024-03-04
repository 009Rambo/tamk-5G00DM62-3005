/**
 * Method Play
 *
 * Determine how many rounds a player can afford to play until running out of money.
 *
 * Method:
 * double play(double money, double roundPrice)
 *
 * Description:
 * Calculates the maximum number of rounds a player can play with the given amount of money and round price.
 *
 * Parameters:
 * @param money The amount of money the player has.
 * @param roundPrice The price for each round.
 *
 * Returns:
 * The maximum number of rounds the player can afford to play.
 *
 * Example Usage:
 * double rounds = play(20.55, 1.5); // Returns 13.0 (20.55 / 1.5)
 *
 * @author Ramesh Pandey <ramesh.pandey@tuni.fi>
 * @version 2024.0226
 * @since 17.0
 */
class Play {

    /**
     * Determines how many rounds a player can afford to play until running out of money.
     *
     * @param money The amount of money the player has.
     * @param roundPrice The price for each round.
     * @return The maximum number of rounds the player can afford to play.
     */
    public static double play(double money, double roundPrice) {
        return money / roundPrice;
    }

    /**
     * Prints main method to demonstrate the usage of the play method.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        double money = 20.55;
        double roundPrice = 1.5;
        double rounds = play(money, roundPrice);
        System.out.println("Maximum rounds: " + rounds);
    }
}

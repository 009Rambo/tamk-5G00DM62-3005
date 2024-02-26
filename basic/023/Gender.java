/**
 * Determine Height Category
 *
 * Determine the height category based on gender and height.
 *
 * Constants:
 * final int MALE = 0;
 * final int FEMALE = 1;
 *
 * Variables:
 * int gender = MALE;
 * int height = 175;
 *
 * Output format:
 * Output is:
 * "Short male" or "Normal male" or "Tall male"
 * or "Short female" or "Normal female" or "Tall female"
 *
 * Decision Table:
 * - if MALE
 *   + below 180, display "Short male"
 *   + between 180..187, display "Normal male"
 *   + over 187, display "Tall male"
 * - if FEMALE
 *   + below 175, display "Short female"
 *   + between 175..182, display "Normal female"
 *   + over 182, display "Tall female"
 *
 * @author Ramesh Pandey <ramesh.pandey@tuni.fi>
 * @version 2024.0226
 * @since 17.0
 */
class DetermineHeightCategory {

    /**
     * Get the height category based on gender and height.
     *
     * @param gender Gender of the person (MALE or FEMALE).
     * @param height Height of the person in centimeters.
     * @return Height category.
     */
    public static String getHeightCategory(int gender, int height) {
        if (gender == 0) { // MALE
            if (height < 180) {
                return "Short male";
            } else if (height >= 180 && height <= 187) {
                return "Normal male";
            } else {
                return "Tall male";
            }
        } else if (gender == 1) { // FEMALE
            if (height < 175) {
                return "Short female";
            } else if (height >= 175 && height <= 182) {
                return "Normal female";
            } else {
                return "Tall female";
            }
        } else {
            return "Invalid gender";
        }
    }

    /**
     * Main method to execute the program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        final int MALE = 0;
        final int FEMALE = 1;

        int gender = MALE;
        int height = 175;

        System.out.println(getHeightCategory(gender, height));
    }
}

/**
 * Method Tax
 *
 * Calculate taxes based on yearly salary and percentage.
 *
 * Method:
 * double yearlyTaxes(double yearlySalary, double percentage)
 *
 * Description:
 * Calculates the amount of taxes based on the yearly salary and the given percentage.
 *
 * Parameters:
 * @param yearlySalary The yearly salary.
 * @param percentage The tax percentage.
 *
 * Returns:
 * The amount of taxes to be paid.
 *
 * Example Usage:
 * double taxes = yearlyTaxes(50000, 20); // Returns 10000 (20% of 50000)
 *
 * @author Ramesh Pandey <ramesh.pandey@tuni.fi>
 * @version 2024.0226
 * @since 17.0
 */
class Tax {

    /**
     * Calculates taxes based on yearly salary and percentage.
     *
     * @param yearlySalary The yearly salary.
     * @param percentage The tax percentage.
     * @return The amount of taxes to be paid.
     */
    public static double yearlyTaxes(double yearlySalary, double percentage) {
        return yearlySalary * (percentage / 100);
    }

    /**
     * Prints main method to demonstrate the usage of the yearlyTaxes method.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        double yearlySalary = 50000;
        double percentage = 20;
        double taxes = yearlyTaxes(yearlySalary, percentage);
        System.out.println("Yearly taxes: " + taxes);
    }
}

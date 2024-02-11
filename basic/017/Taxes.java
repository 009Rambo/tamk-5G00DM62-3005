
/**
 * Calculate Taxes
 *
 * Write a program to calculate annual taxes from the given initial values:
 * - Total earnings in year: 134,000.
 * - Of which, the stock exchange earnings are 23,000.
 * - The nominal tax rate for a person is 27.3%.
 * - The government tax rate for extra income, like stocks, is 21%.
 *
 * The program should calculate taxes and display the result.
 * The results may contain any number of decimals.
 *
 * @author Ramesh Pandey <ramesh.pandey@tuni.fi>
 * @version 2024.0210
 * @since 17.0
 */
class CalculateTaxes {

    /**
     * Calculates the total taxes based on total earnings and tax rates.
     *
     * @param totalEarnings      Total earnings in the year.
     * @param stockEarnings      Earnings from the stock exchange.
     * @param nominalTaxRate     Nominal tax rate for a person.
     * @param governmentTaxRate  Government tax rate for extra income.
     * @return Total taxes.
     */
    public static double calculateTaxes(double totalEarnings,
        double stockEarnings, double nominalTaxRate,
        double governmentTaxRate) {
        double workEarnings = totalEarnings - stockEarnings;
        double nominalTax = workEarnings * (nominalTaxRate / 100);
        double stockTax = stockEarnings * (governmentTaxRate / 100);
        return nominalTax + stockTax;
    }

    /**
     * Calculates the net income after taxes.
     *
     * @param totalEarnings      Total earnings in the year.
     * @param totalTaxes         Total taxes paid.
     * @return Net income after taxes.
     */
    public static double calculateNetIncome(double totalEarnings,
        double totalTaxes) {
        return totalEarnings - totalTaxes;
    }

    /**
     * Prints main method to execute the program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        double totalEarnings = 134000.0;
        double stockEarnings = 23000.0;
        double nominalTaxRate = 27.3;
        double governmentTaxRate = 21.0;

        double totalTaxes = calculateTaxes(totalEarnings, stockEarnings,
        nominalTaxRate, governmentTaxRate);
        double netIncome = calculateNetIncome(totalEarnings, totalTaxes);
        double workEarnings = totalEarnings - stockEarnings;

        System.out.println("All income             : " + totalEarnings);
        System.out.println("Work earnings          : " + workEarnings);
        System.out.println("Stock earnings         : " + stockEarnings + "\n");
        System.out.println("Taxes total            : " + String.format("%.2f",
         totalTaxes));
        System.out.println("Net income             : " + String.format("%.2f",
        netIncome) + " (after taxes)");
    }
}



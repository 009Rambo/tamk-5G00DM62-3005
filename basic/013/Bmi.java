/**
 * Calculate bmi
 *
 * Calculate body mass index from WEIGHT and HEIGHT. Display results:
 *
 * Weight (kg): NN
 * height (m) : N.N
 * BMI        : N.N
 *
 * [1] Body Mass Index
 *
 * @author Ramesh Pandey <ramesh.pandey@tuni.fi>
 * @version 2024.0209
 * @since 17.0
 */
class BMI {

    /**
     * Calculates the body mass index (BMI).
     *
     * @param weight Weight of the person in kilograms.
     * @param height Height of the person in meters.
     * @return BMI value.
     */
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    /**
     * Prints main method to execute the program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        double weightKg = 70; // Example weight in kilograms
        double heightM = 1.75; // Example height in meters


        System.out.println("Weight (kg): " + weightKg);
        System.out.println("Height (m) : " + heightM);
        System.out.printf("BMI        : %.2f\n",
        calculateBMI(weightKg, heightM));
    }
}
/**
 * Represents a car with various properties and functionalities.
 */
public class Class8 {
    private String brand;
    private int year;
    private double mileage;
    private String transmissionType;

    /**
     * Constructs a car object with the given properties.
     * @param brand The brand of the car
     * @param year The manufacturing year of the car
     * @param mileage The mileage of the car
     * @param transmissionType The type of transmission of the car
     */
    public Class8(String brand, int year, double mileage, String transmissionType) {
        this.brand = brand;
        this.year = year;
        this.mileage = mileage;
        this.transmissionType = transmissionType;
    }

    // Getters for car properties (brand, year, mileage, transmissionType)...

    /**
     * Checks if the mileage of the car is acceptable.
     * @return True if mileage is less than or equal to 200,000 miles, false otherwise
     */
    public boolean isMileageAcceptable() {
        return mileage <= 200000;
    }

    /**
     * Determines the fuel efficiency category based on the mileage of the car.
     * @return "High" for mileage less than 100,000, "Moderate" for mileage less than 200,000, "Low" otherwise
     */
    public String getFuelEfficiencyCategory() {
        if (mileage < 100000) {
            return "High";
        } else if (mileage < 200000) {
            return "Moderate";
        } else {
            return "Low";
        }
    }

    /**
     * Calculates the total cost of ownership for the car.
     * @param purchasePrice The purchase price of the car
     * @param repairCost The total repair cost of the car
     * @param fuelCost The total fuel cost of the car
     * @return The total cost of ownership
     */
    public double calculateTotalCostOfOwnership(double purchasePrice, double repairCost, double fuelCost) {
        return purchasePrice + repairCost + fuelCost;
    }

    /**
     * Checks if the model year of the car is within a specified range.
     * @param currentYear The current year
     * @param minYear The minimum allowable year
     * @param maxYear The maximum allowable year
     * @return True if the model year is within the specified range, false otherwise
     */
    public boolean isModelYearInRange(int currentYear, int minYear, int maxYear) {
        return currentYear >= minYear && currentYear <= maxYear;
    }

    /**
     * Determines if the car has automatic transmission.
     * @return True if the car has automatic transmission, false otherwise
     */
    public boolean hasAutomaticTransmission() {
         return "Automatic".equals(transmissionType);
    }
}

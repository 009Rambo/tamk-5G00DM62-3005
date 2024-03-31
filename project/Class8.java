public class Class8 {
    /**
     * Checks if a given car's mileage is within an acceptable range.
     * @param mileage The mileage of the car
     * @return True if the mileage is within the acceptable range, false otherwise
     */
    public boolean isMileageAcceptable(double mileage) {
        return mileage >= 0 && mileage <= 300000; // Assuming maximum mileage is 300,000 miles
    }

    /**
     * Determines the fuel efficiency category of a car based on its miles per gallon (mpg).
     * @param mpg The miles per gallon of the car
     * @return The fuel efficiency category of the car ("Low", "Moderate", "High")
     */
    public String getFuelEfficiencyCategory(double mpg) {
        if (mpg < 15) {
            return "Low";
        } else if (mpg < 25) {
            return "Moderate";
        } else {
            return "High";
        }
    }

    /**
     * Calculates the total cost of ownership (TCO) of a car over a specified number of years.
     * @param initialPrice The initial price of the car
     * @param annualMaintenanceCost The annual maintenance cost of the car
     * @param years The number of years to calculate TCO for
     * @return The total cost of ownership over the specified number of years
     */
    public double calculateTotalCostOfOwnership(double initialPrice, double annualMaintenanceCost, int years) {
        return initialPrice + (annualMaintenanceCost * years);
    }

    /**
     * Checks if a car's model year falls within a specified range.
     * @param modelYear The model year of the car
     * @param minYear The minimum allowable model year
     * @param maxYear The maximum allowable model year
     * @return True if the model year is within the specified range, false otherwise
     */
    public boolean isModelYearInRange(int modelYear, int minYear, int maxYear) {
        return modelYear >= minYear && modelYear <= maxYear;
    }

    /**
     * Determines the type of transmission of a car based on its description.
     * @param description The description of the car's transmission
     * @return The type of transmission ("Automatic", "Manual", "Semi-Automatic")
     */
    public String determineTransmissionType(String description) {
        if (description.contains("automatic")) {
            return "Automatic";
        } else if (description.contains("manual")) {
            return "Manual";
        } else {
            return "Semi-Automatic";
        }
    }
}

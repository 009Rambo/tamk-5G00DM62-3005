public class Class10 {
    /**
     * Checks if a given car's year is within a valid range.
     * @param year The year of the car
     * @return True if the year is within a valid range, false otherwise
     */
    public boolean isValidCarYear(int year) {
        return year >= 1900 && year <= 2025; // Assuming cars cannot be manufactured after 2025
    }

    /**
     * Determines the type of car based on its fuel type.
     * @param fuelType The fuel type of the car
     * @return The type of car ("Gasoline", "Electric", "Hybrid")
     */
    public String determineCarType(String fuelType) {
        if (fuelType.equalsIgnoreCase("Gasoline")) {
            return "Gasoline";
        } else if (fuelType.equalsIgnoreCase("Electric")) {
            return "Electric";
        } else {
            return "Hybrid";
        }
    }

    /**
     * Calculates the annual depreciation rate of a car based on its initial price and years of ownership.
     * @param initialPrice The initial price of the car
     * @param yearsOwned The number of years the car has been owned
     * @return The annual depreciation rate of the car
     * @throws IllegalArgumentException if the years owned is less than 1
     */
    public double calculateDepreciationRate(double initialPrice, int yearsOwned) {
        if (yearsOwned < 1) {
            throw new IllegalArgumentException("Years owned must be at least 1");
        }
        double finalPrice = initialPrice * Math.pow(0.9, yearsOwned); // Assuming 10% depreciation per year
        return (initialPrice - finalPrice) / initialPrice;
    }

    /**
     * Checks if a car's make is a luxury brand.
     * @param make The make of the car
     * @return True if the make is a luxury brand, false otherwise
     */
    public boolean isLuxuryCar(String make) {
        return make.equalsIgnoreCase("Mercedes") ||
               make.equalsIgnoreCase("BMW") ||
               make.equalsIgnoreCase("Audi");
    }

    /**
     * Determines the recommended oil type for a car based on its make and model year.
     * @param make The make of the car
     * @param modelYear The model year of the car
     * @return The recommended oil type for the car
     */
    public String determineRecommendedOil(String make, int modelYear) {
        if (make.equalsIgnoreCase("Toyota") && modelYear >= 2010) {
            return "5W-30";
        } else if (make.equalsIgnoreCase("Honda")) {
            return "0W-20";
        } else {
            return "10W-40";
        }
    }
}

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class Class8Test {
    Class8 class8 = new Class8("Toyota", 2015, 150000, "Automatic");

    @Test
    public void testIsMileageAcceptable() {
        assertTrue(class8.isMileageAcceptable());

        // Additional test cases
        assertFalse(new Class8("Toyota", 2015, 500000, "Automatic").isMileageAcceptable());
        assertFalse(new Class8("Toyota", 2015, 200000, "Automatic").isMileageAcceptable());
        assertTrue(new Class8("Toyota", 2015, 100000, "Automatic").isMileageAcceptable());
    }

    @Test
    public void testGetFuelEfficiencyCategory() {
        assertEquals("Moderate", class8.getFuelEfficiencyCategory());

        // Additional test cases
        assertEquals("High", new Class8("Toyota", 2015, 50000, "Automatic").getFuelEfficiencyCategory());
        assertEquals("Low", new Class8("Toyota", 2015, 250000, "Automatic").getFuelEfficiencyCategory());
    }

    @Test
    public void testCalculateTotalCostOfOwnership() {
        assertEquals(50000.0, class8.calculateTotalCostOfOwnership(25000.0, 10000.0, 15000.0), 0.001);

        // Additional test cases
        assertEquals(100000.0, new Class8("Toyota", 2015, 150000, "Automatic").calculateTotalCostOfOwnership(25000.0, 40000.0, 35000.0), 0.001);
        assertEquals(30000.0, new Class8("Toyota", 2015, 150000, "Automatic").calculateTotalCostOfOwnership(10000.0, 10000.0, 10000.0), 0.001);
    }

    @Test
    public void testIsModelYearInRange() {
        assertTrue(class8.isModelYearInRange(2015, 2000, 2022));

        // Additional test cases
        assertFalse(class8.isModelYearInRange(1990, 2000, 2022));
        assertTrue(class8.isModelYearInRange(2022, 2000, 2022));
    }

    @Test
    public void testHasAutomaticTransmission() {
        assertTrue(class8.hasAutomaticTransmission());

        // Additional test cases
        assertFalse(new Class8("Toyota", 2015, 150000, "Manual").hasAutomaticTransmission());
        assertTrue(new Class8("Toyota", 2015, 150000, "Semi-Automatic").hasAutomaticTransmission());
    }
}

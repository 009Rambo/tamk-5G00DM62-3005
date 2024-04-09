import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Class8Test {
    Class8 class8 = new Class8("Toyota", 2015, 150000, "Automatic");

    @Test
    public void testIsMileageAcceptable_MileageWithinRange() {
        assertTrue(class8.isMileageAcceptable());
    }

    @Test
    public void testIsMileageAcceptable_MileageTooHigh() {
        assertFalse(new Class8("Toyota", 2015, 500000, "Automatic").isMileageAcceptable());
    }

    @Test
    public void testIsMileageAcceptable_MileageOver200k() {
        assertFalse(new Class8("Toyota", 2015, 200001, "Automatic").isMileageAcceptable());
    }

    @Test
    public void testGetFuelEfficiencyCategory_ModerateMileage() {
        assertEquals("Moderate", class8.getFuelEfficiencyCategory());
    }

    @Test
    public void testGetFuelEfficiencyCategory_HighMileage() {
        assertEquals("High", new Class8("Toyota", 2015, 50000, "Automatic").getFuelEfficiencyCategory());
    }

    @Test
    public void testGetFuelEfficiencyCategory_LowMileage() {
        assertEquals("Low", new Class8("Toyota", 2015, 250000, "Automatic").getFuelEfficiencyCategory());
    }

    @Test
    public void testCalculateTotalCostOfOwnership_StandardValues() {
        assertEquals(50000.0, class8.calculateTotalCostOfOwnership(25000.0, 10000.0, 15000.0), 0.001);
    }

    @Test
    public void testCalculateTotalCostOfOwnership_HighMileage() {
        assertEquals(100000.0, new Class8("Toyota", 2015, 150000, "Automatic").calculateTotalCostOfOwnership(25000.0, 40000.0, 35000.0), 0.001);
    }

    @Test
    public void testCalculateTotalCostOfOwnership_LowMileage() {
        assertEquals(30000.0, new Class8("Toyota", 2015, 150000, "Automatic").calculateTotalCostOfOwnership(10000.0, 10000.0, 10000.0), 0.001);
    }

    @Test
    public void testIsModelYearInRange_WithinRange() {
        assertTrue(class8.isModelYearInRange(2015, 2000, 2022));
    }

    @Test
    public void testIsModelYearInRange_BeforeRange() {
        assertFalse(class8.isModelYearInRange(1990, 2000, 2022));
    }

    @Test
    public void testIsModelYearInRange_AtUpperBound() {
        assertTrue(class8.isModelYearInRange(2022, 2000, 2022));
    }

    @Test
    public void testHasAutomaticTransmission_Yes() {
        assertTrue(class8.hasAutomaticTransmission());
    }

    @Test
    public void testHasAutomaticTransmission_No() {
        assertFalse(new Class8("Toyota", 2015, 150000, "Manual").hasAutomaticTransmission());
    }

    // Uncomment this test if Semi-Automatic transmission is supported
    /*@Test
    public void testHasAutomaticTransmission_SemiAutomatic() {
        assertTrue(new Class8("Toyota", 2015, 150000, "Semi-Automatic").hasAutomaticTransmission());
    }*/
}

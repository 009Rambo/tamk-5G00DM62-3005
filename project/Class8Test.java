import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Class8Test {
    Class8 class8 = new Class8();

    @Test
    public void testIsMileageAcceptable() {
        assertTrue(class8.isMileageAcceptable(150000));
        assertFalse(class8.isMileageAcceptable(-10000));
        assertFalse(class8.isMileageAcceptable(350000));
    }

    @Test
    public void testGetFuelEfficiencyCategory() {
        assertEquals("Low", class8.getFuelEfficiencyCategory(10));
        assertEquals("Moderate", class8.getFuelEfficiencyCategory(20));
        assertEquals("High", class8.getFuelEfficiencyCategory(30));
    }

    @Test
    public void testCalculateTotalCostOfOwnership() {
        assertEquals(20000, class8.calculateTotalCostOfOwnership(15000, 1000, 5), 0);
        assertEquals(40000, class8.calculateTotalCostOfOwnership(30000, 2000, 10), 0);
    }

    @Test
    public void testIsModelYearInRange() {
        assertTrue(class8.isModelYearInRange(2015, 2000, 2022));
        assertFalse(class8.isModelYearInRange(1990, 2000, 2022));
        assertTrue(class8.isModelYearInRange(2022, 2000, 2022));
    }

    @Test
    public void testDetermineTransmissionType() {
        assertEquals("Automatic", class8.determineTransmissionType("This car has automatic transmission"));
        assertEquals("Manual", class8.determineTransmissionType("Manual transmission is included"));
        assertEquals("Semi-Automatic", class8.determineTransmissionType("Semi-Automatic transmission option available"));
    }
}

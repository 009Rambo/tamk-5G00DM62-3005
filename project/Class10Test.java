import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Class10Test {
    Class10 class10 = new Class10();

    @Test
    public void testIsValidCarYear() {
        assertTrue(class10.isValidCarYear(2000));
        assertTrue(class10.isValidCarYear(2025));
        assertFalse(class10.isValidCarYear(1899));
        assertFalse(class10.isValidCarYear(2030));
    }

    @Test
    public void testDetermineCarType() {
        assertEquals("Gasoline", class10.determineCarType("Gasoline"));
        assertEquals("Electric", class10.determineCarType("Electric"));
        assertEquals("Hybrid", class10.determineCarType("Hybrid"));
    }

    @Test
    public void testCalculateDepreciationRate() {
        assertEquals(0.1, class10.calculateDepreciationRate(10000, 1), 0.001); // 10% depreciation in 1 year
        assertEquals(0.19, class10.calculateDepreciationRate(10000, 2), 0.001); // 19% depreciation in 2 years
        assertEquals(0.271, class10.calculateDepreciationRate(10000, 3), 0.001); // 27.1% depreciation in 3 years
        try {
            class10.calculateDepreciationRate(10000, 0);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            // Exception thrown as expected
        }
    }

    @Test
    public void testIsLuxuryCar() {
        assertTrue(class10.isLuxuryCar("Mercedes"));
        assertTrue(class10.isLuxuryCar("BMW"));
        assertTrue(class10.isLuxuryCar("Audi"));
        assertFalse(class10.isLuxuryCar("Toyota"));
        assertFalse(class10.isLuxuryCar("Honda"));
        assertFalse(class10.isLuxuryCar("Ford"));
    }

    @Test
    public void testDetermineRecommendedOil() {
        assertEquals("5W-30", class10.determineRecommendedOil("Toyota", 2015));
        assertEquals("0W-20", class10.determineRecommendedOil("Honda", 2020));
        assertEquals("10W-40", class10.determineRecommendedOil("Ford", 2010));
    }
}

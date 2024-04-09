import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Class10Test {
    Class10 class10 = new Class10();

    @Test
    public void testIsValidCarYear_2000() {
        assertTrue(class10.isValidCarYear(2000));
    }

    @Test
    public void testIsValidCarYear_2025() {
        assertTrue(class10.isValidCarYear(2025));
    }

    @Test
    public void testIsValidCarYear_1899() {
        assertFalse(class10.isValidCarYear(1899));
    }

    @Test
    public void testIsValidCarYear_2030() {
        assertFalse(class10.isValidCarYear(2030));
    }

    @Test
    public void testDetermineCarType_Gasoline() {
        assertEquals("Gasoline", class10.determineCarType("Gasoline"));
    }

    @Test
    public void testDetermineCarType_Electric() {
        assertEquals("Electric", class10.determineCarType("Electric"));
    }

    @Test
    public void testDetermineCarType_Hybrid() {
        assertEquals("Hybrid", class10.determineCarType("Hybrid"));
    }

    @Test
    public void testCalculateDepreciationRate_1Year() {
        assertEquals(0.1, class10.calculateDepreciationRate(10000, 1), 0.001); // 10% depreciation in 1 year
    }

    @Test
    public void testCalculateDepreciationRate_2Years() {
        assertEquals(0.19, class10.calculateDepreciationRate(10000, 2), 0.001); // 19% depreciation in 2 years
    }

    @Test
    public void testCalculateDepreciationRate_3Years() {
        assertEquals(0.271, class10.calculateDepreciationRate(10000, 3), 0.001); // 27.1% depreciation in 3 years
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateDepreciationRate_InvalidYear() {
        class10.calculateDepreciationRate(10000, 0);
    }

    @Test
    public void testIsLuxuryCar_Mercedes() {
        assertTrue(class10.isLuxuryCar("Mercedes"));
    }

    @Test
    public void testIsLuxuryCar_BMW() {
        assertTrue(class10.isLuxuryCar("BMW"));
    }

    @Test
    public void testIsLuxuryCar_Audi() {
        assertTrue(class10.isLuxuryCar("Audi"));
    }

    @Test
    public void testIsLuxuryCar_Toyota() {
        assertFalse(class10.isLuxuryCar("Toyota"));
    }

    @Test
    public void testIsLuxuryCar_Honda() {
        assertFalse(class10.isLuxuryCar("Honda"));
    }

    @Test
    public void testIsLuxuryCar_Ford() {
        assertFalse(class10.isLuxuryCar("Ford"));
    }

    @Test
    public void testDetermineRecommendedOil_Toyota_2015() {
        assertEquals("5W-30", class10.determineRecommendedOil("Toyota", 2015));
    }

    @Test
    public void testDetermineRecommendedOil_Honda_2020() {
        assertEquals("0W-20", class10.determineRecommendedOil("Honda", 2020));
    }

    @Test
    public void testDetermineRecommendedOil_Ford_2010() {
        assertEquals("10W-40", class10.determineRecommendedOil("Ford", 2010));
    }
}

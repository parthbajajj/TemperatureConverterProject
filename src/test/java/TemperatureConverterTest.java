import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConverterTest {

    @Test
    public void testCelsiusToFahrenheit() {

        TemperatureConverter converter = new TemperatureConverter();

        double result = converter.celsiusToFahrenheit(0);

        assertEquals(32.0, result, 0.001);
    }

    @Test
    public void testFahrenheitToCelsius() {

        TemperatureConverter converter = new TemperatureConverter();

        double result = converter.fahrenheitToCelsius(212);

        assertEquals(100.0, result, 0.001);
    }

}

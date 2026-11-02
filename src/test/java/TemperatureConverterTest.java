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

    @Test
    public void testCelsiusToKelvin() {

        TemperatureConverter converter = new TemperatureConverter();

        double result = converter.celsiusToKelvin(0);

        assertEquals(273.15, result, 0.001);
    }

}

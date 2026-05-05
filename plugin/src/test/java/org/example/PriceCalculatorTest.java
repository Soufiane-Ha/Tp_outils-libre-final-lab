package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PriceCalculatorTest {
@Test
void shouldApplySave10Discount() {

    PriceCalculator calc = new PriceCalculator();

    double result = calc.calculate(
            new double[] { 100 },
            new int[] { 1 },
            "REGULAR",
            "SAVE10");

    assertEquals(103.5, result);
}
}
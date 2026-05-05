package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PriceCalculatorTest {

    @Test
    void shouldApplySave10Discount() {

        // Prices
        List<Double> prices = Arrays.asList(100.0);

        // Quantities
        List<Integer> quantities = Arrays.asList(1);

        // Customer
        Customer customer = new Customer(
                "Soufiane",
                "REGULAR");

        // Order
        Order order = new Order(
                prices,
                quantities);

        // Subtotal
        double subtotal = order.getSubtotal();

        // Discount
        DiscountService discountService = new DiscountService();

        double discount = discountService.applyDiscount(
                subtotal,
                "SAVE10",
                customer.getType());

        // After discount
        double afterDiscount = subtotal - discount;

        // Tax
        TaxCalculator taxCalculator = new TaxCalculator();

        double tax = taxCalculator.calculateTax(
                afterDiscount);

        // Final price
        double finalPrice = afterDiscount + tax;

        // Expected:
        // 100 - 10% = 90
        // 90 + 15% tax = 103.5

        assertEquals(
                103.5,
                finalPrice,
                0.01);
    }
}
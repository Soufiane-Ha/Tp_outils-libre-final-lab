package org.example;

import java.util.Arrays;
import java.util.List;

public class PriceCalculator {

    public void calculate() {

        // Item prices
        List<Double> prices = Arrays.asList(
                100.0,
                50.0,
                20.0);

        // Quantities
        List<Integer> quantities = Arrays.asList(
                2,
                1,
                3);

        // Customer
        Customer customer = new Customer(
                "Soufiane",
                "VIP");

        // Discount code
        String code = "SAVE10";

        // Create order
        Order order = new Order(prices, quantities);

        // Calculate subtotal
        double subtotal = order.getSubtotal();

        // Apply discount
        DiscountService discountService = new DiscountService();

        double discount = discountService.applyDiscount(
                subtotal,
                code,
                customer.getType());

        // Price after discount
        double afterDiscount = subtotal - discount;

        // Tax calculation
        TaxCalculator taxCalculator = new TaxCalculator();

        double tax = taxCalculator.calculateTax(afterDiscount);

        // Final price
        double finalPrice = afterDiscount + tax;

        // Display results
        System.out.println("===== ORDER SUMMARY =====");

        System.out.println("Customer: " + customer.getName());

        System.out.println("Customer Type: " + customer.getType());

        System.out.println("Subtotal: $" + subtotal);

        System.out.println("Discount: $" + discount);

        System.out.println("After Discount: $" + afterDiscount);

        System.out.println("Tax: $" + tax);

        System.out.println("Final Price: $" + finalPrice);
    }
}
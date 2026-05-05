package org.example;
public class PriceCalculator {

    public double calculate(
            double[] prices,
            int[] qty,
            String customerType,
            String code) {

        double total = 0;

        for (int i = 0; i < prices.length; i++) {
            total += prices[i] * qty[i];
        }

        if (code.equals("SAVE10")) {
            total = total - total * 0.1;
        }

        if (customerType.equals("VIP")) {
            total = total - 20;
        }

        total = total + total * 0.15;

        return total;
    }
}
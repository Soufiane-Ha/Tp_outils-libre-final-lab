package org.example;

public class DiscountService {

    public double applyDiscount(double total, String code, String customerType) {

        double discount = 0;

        if ("SAVE10".equals(code)) {
            discount = total * 0.10;
        }

        if ("SAVE20".equals(code)) {
            discount = total * 0.20;
        }

        if ("VIP".equals(customerType)) {
            discount += 20;
        }

        return discount;
    }
}
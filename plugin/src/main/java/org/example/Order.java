package org.example;

import java.util.List;

public class Order {

    private List<Double> prices;
    private List<Integer> quantities;

    public Order(List<Double> prices, List<Integer> quantities) {
        this.prices = prices;
        this.quantities = quantities;
    }

    public double getSubtotal() {
        double total = 0;

        for (int i = 0; i < prices.size(); i++) {
            total += prices.get(i) * quantities.get(i);
        }

        return total;
    }
}

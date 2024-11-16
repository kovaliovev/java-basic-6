package org.example;

public class InstantCoffee extends Coffee {
    public InstantCoffee(double volume, double price, double weight, int quality) {
        super(volume, price, weight, quality);
    }

    @Override
    public String getType() {
        return "Instant";
    }
}

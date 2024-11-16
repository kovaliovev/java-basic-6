package org.example;

public class GroundCoffee extends Coffee {
    public GroundCoffee(double volume, double price, double weight, int quality) {
        super(volume, price, weight, quality);
    }

    @Override
    public String getType() {
        return "Ground";
    }
}

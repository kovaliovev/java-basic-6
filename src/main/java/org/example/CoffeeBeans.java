package org.example;

public class CoffeeBeans extends Coffee {
    public CoffeeBeans(double volume, double price, double weight, int quality) {
        super(volume, price, weight, quality);
    }

    @Override
    public String getType() {
        return "Beans";
    }
}
package org.example;

public abstract class Coffee {
    protected double volume;
    protected double price;
    protected double weight;
    protected int quality;

    public Coffee(double volume, double price, double weight, int quality) {
        if (volume <= 0) {
            throw new IllegalArgumentException("Volume must be positive values.");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive values.");
        }
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be positive values.");
        }
        if (quality < 1 || quality > 100) {
            throw new IllegalArgumentException("Quality must be between 1 and 100.");
        }
        this.volume = volume;
        this.price = price;
        this.weight = weight;
        this.quality = quality;
    }

    public double getPriceToWeightRatio() {
        return price / weight;
    }

    public int getQuality() {
        return quality;
    }

    public abstract String getType();
}


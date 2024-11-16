package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Example Coffee objects
        Coffee coffee1 = new CoffeeBeans(10.0, 100.0, 5.0, 80);
        Coffee coffee2 = new GroundCoffee(15.0, 80.0, 4.0, 85);
        Coffee coffee3 = new InstantCoffee(5.0, 50.0, 1.5, 70);

        // Empty constructor
        CoffeeLinkedSet emptySet = new CoffeeLinkedSet();
        System.out.println("Empty set created. Size: " + emptySet.size());

        // Constructor with one Coffee object
        CoffeeLinkedSet singleSet = new CoffeeLinkedSet(coffee1);
        System.out.println("Set with one coffee created. Size: " + singleSet.size());

        // Constructor with collection of Coffee objects
        CoffeeLinkedSet collectionSet = new CoffeeLinkedSet(Arrays.asList(coffee1, coffee2, coffee3));
        System.out.println("Set with a collection of coffees created. Size: " + collectionSet.size());

        // Adding a new Coffee object
        collectionSet.add(new CoffeeBeans(12.0, 120.0, 6.0, 90));
        System.out.println("After adding a coffee. Size: " + collectionSet.size());

        // Removing a Coffee object
        collectionSet.remove(coffee2);
        System.out.println("After removing a coffee. Size: " + collectionSet.size());

        // Iterating through the set
        System.out.println("Coffees in the set:");
        for (Coffee coffee : collectionSet) {
            System.out.println("- Coffee: " + coffee.toString());
        }
    }
}

# Coffee Linked Set

This project implements a custom `Set` collection using a doubly linked list to store coffee objects. The collection is generic, and the coffee objects are represented by different types of coffee (such as `CoffeeBeans`, `GroundCoffee`, and `InstantCoffee`), each with specific properties like weight, price, quality, etc.

## Project Structure

- **`Coffee.java`**: An abstract class representing the common properties and methods for all coffee types.
- **`CoffeeBeans.java`**: Represents coffee beans, extends `Coffee`.
- **`GroundCoffee.java`**: Represents ground coffee, extends `Coffee`.
- **`InstantCoffee.java`**: Represents instant coffee, extends `Coffee`.
- **`CoffeeLinkedSet.java`**: A custom implementation of a `Set` that uses a doubly linked list to store `Coffee` objects.
- **`Main.java`**: Entry point for the application that demonstrates how the collection works with examples.

## Features

- **Custom `Set` implementation**: A `Set`-like collection that allows adding, removing, and checking the presence of coffee objects, based on the `Set` interface.
- **Doubly Linked List**: Internally uses a doubly linked list to store coffee objects.
- **Type-safe**: The collection only accepts objects of type `Coffee` or its subclasses.
- **Multiple constructors**: Provides constructors to initialize the collection with no elements, a single coffee object, or a collection of coffee objects.
- **Iterators**: Supports iteration through the collection to access coffee objects.
- **Basic Set Operations**: Implements all common `Set` operations such as `add`, `remove`, `contains`, and `clear`.

## How to Run

### Prerequisites
1. Install the [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) version 8 or above.
2. Install [Maven](https://maven.apache.org/) or use a Java-compatible IDE like [IntelliJ IDEA](https://www.jetbrains.com/idea/) or [Eclipse](https://www.eclipse.org/ide/).

### Clone the repository
```bash
git clone https://github.com/kovaliovev/java-basic-6.git
```

### Navigate to the root directory of the project
```bash
cd java-basic-6
```

### Compile the project
```bash
javac -d out -sourcepath src src/main/java/org/example/*.java
```

### Run the project
```bash
java -cp out org.example.Main
```

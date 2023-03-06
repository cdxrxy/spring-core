package org.example;

public class Dog implements Animal {
    private Dog() {}
    @Override
    public String getSound() {
        return "woof";
    }

    public static Dog getDog() {
        return new Dog();
    }
}
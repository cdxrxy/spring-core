package org.example;

import org.springframework.stereotype.Component;

@Component
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
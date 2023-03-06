package org.example;

public class Person {
    private Animal animal;

    public Animal getAnimal() {
        return this.animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Person(Animal animal) {
        this.animal = animal;
    }

    public void init() {
        System.out.println("Person Bean Created!");
    }

    public void destroy() {
        System.out.println("Person Bean Deleted!");
    }
}
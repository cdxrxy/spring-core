package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private Animal animal;

    public Animal getAnimal() {
        return this.animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Autowired
    public Person(@Qualifier("cat") Animal animal) {
        this.animal = animal;
    }

    public void init() {
        System.out.println("Person Bean Created!");
    }

    public void destroy() {
        System.out.println("Person Bean Deleted!");
    }
}
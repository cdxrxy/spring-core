package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class Cat implements Animal {
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Cat(){}
//    @Value("${cat.name}")
    private String name;
    private int age;
    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSound() {
        return "Meow";
    }

//    @PostConstruct
    public void init() {
        System.out.println("Hello from cat");
    }

//    @PreDestroy
    public void destroy() {
        System.out.println("Bye from cat");
    }
}

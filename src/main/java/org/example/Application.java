package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Dog dog = context.getBean("dog", Dog.class);
        Cat cat = context.getBean("cat", Cat.class);
        Person person = context.getBean("person", Person.class);
        System.out.println(person.getAnimal().getSound());
        System.out.println(cat.getName());
        System.out.println(dog.getSound());
        context.close();


    }
}

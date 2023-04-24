package org.example;

import org.springframework.stereotype.Component;

//@Component
public class Cow implements Animal {
    @Override
    public String getSound() {
        return "Moo";
    }
}

package org.example.Animal.model;

public class Pet extends Animal{

    public Pet(String name, String birthday) {
        super(name, birthday);
    }

    public String myAnimalGroup() {
        return "Pets";
    }
}

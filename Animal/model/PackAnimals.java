package org.example.Animal.model;

public class PackAnimals extends Animal{

    public PackAnimals(String name, String birthday) {
        super(name, birthday);
    }

    public String myAnimalGroup() {
        return "Pack animals";
    }
}

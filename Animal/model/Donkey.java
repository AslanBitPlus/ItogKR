package org.example.Animal.model;

import java.util.ArrayList;

public class Donkey extends PackAnimals {
    public ArrayList<String> myCommands;

    public Donkey(String name, String birthday, ArrayList<String> myCommands) {
        super(name, birthday);
        this.myCommands = myCommands;
    }

    public Donkey(String name, String birthday) {
        super(name, birthday);
        ArrayList<String> myCommands = new ArrayList<String>();
    }

    @Override
    public String myAnimalGroup() {
        return super.myAnimalGroup();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getBirthday() {
        return super.getBirthday();
    }

    @Override
    public void setBirthday(String birthday) {
        super.setBirthday(birthday);
    }

    @Override
    public String toString() {
        return myAnimalGroup() + " - " + "Donkey {" +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                "myCommands=" + myCommands +
                '}';
    }

}

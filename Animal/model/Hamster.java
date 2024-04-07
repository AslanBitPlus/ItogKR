package org.example.Animal.model;

import java.util.ArrayList;

public class Hamster extends Pet {
    public ArrayList<String> myCommands;

    public Hamster(String name, String birthday) {
        super(name, birthday);
        ArrayList<String> myCommands = new ArrayList<String>();
    }

    public Hamster(String name, String birthday, ArrayList<String> myCommands) {
        super(name, birthday);
        this.myCommands = myCommands;
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
    public String myAnimalGroup() {
        return super.myAnimalGroup();
    }

    /*
    public void addNewCommand(String cmd) {
        System.out.println("Новая команда для " + myAnimalGroup() +
                " - " + name + " -> " + cmd);
        myCommands.add(cmd);
    }

     */

    public ArrayList<String> getMyCommands() {
        return myCommands;
    }

    public void setMyCommands(ArrayList<String> myCommands) {
        this.myCommands = myCommands;
    }

    @Override
    public String toString() {
        return myAnimalGroup() + " - " + "Hamster {" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                "myCommands=" + myCommands +
                '}';
    }
}

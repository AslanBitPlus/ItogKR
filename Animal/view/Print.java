package org.example.Animal.view;

import org.example.Animal.controller.Run;
import org.example.Animal.model.Animal;

public class Print {

    // Печать cats
    public static void cats() {
        System.out.println("Cats =============");
        for (int i = 0; i < Run.cats.size(); i++) {
            System.out.println(Run.cats.get(i));
        }
    }
    //================================================

    // Печать списка Dog
    public static void dogs() {
        System.out.println("Dogs =============");
        for (int i = 0; i < Run.dogs.size(); i++) {
            System.out.println(Run.dogs.get(i));
        }
    }
    //================================================

    // Печать списка Hamster
    public static void hamsters() {
        System.out.println("Hamsters =============");
        for (int i = 0; i < Run.hamsters.size(); i++) {
            System.out.println(Run.hamsters.get(i));
        }
    }
    //================================================

    // Печать списка Horse
    public static void horses() {
        // Печать horses
        System.out.println("Horses =============");
            for (int i = 0; i < Run.horses.size(); i++) {
                System.out.println(Run.horses.get(i));
            }
    }
    //================================================

    // Печать списка Donkey
    public static void donkeys() {
        // Печать horses
        System.out.println("donkeys =============");
        for (int i = 0; i < Run.donkeys.size(); i++) {
            System.out.println(Run.donkeys.get(i));
        }
    }
    //================================================

    // Печать списка Camel
    public static void camels() {
        // Печать horses
        System.out.println("camels =============");
        for (int i = 0; i < Run.camels.size(); i++) {
            System.out.println(Run.camels.get(i));
        }
    }
    //================================================

    // Печать количества всех животных
    public static void animalCount() {
        //
        System.out.println("Количество животных - " + Animal.count);
    }
    //================================================

    // Печать всех животных
    public static void allAnimals() {
        // Печать cats
        cats();
        dogs();
        hamsters();
        horses();
        donkeys();
        camels();
    }
    //================================================

}

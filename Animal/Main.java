package org.example.Animal;

import org.example.Animal.controller.Run;
import org.example.Animal.view.Print;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Вводь начальных данных о животных
        Run.inputData();

        // Вывод меню программы
        Run.menu();
        // Ввод команды
        int cmdItem = Run.selMenu();
        // ================================
        while (cmdItem != 6) {
        switch (cmdItem) {
            case 1:
                // Печать всех животных
                Print.allAnimals();
                break;
            case 11:
                // Печать Cats
                Print.cats();
                break;
            case 12:
                // Печать Dogs
                Print.dogs();
                break;
            case 13:
                // Печать Hamsters
                Print.hamsters();
                break;
            case 14:
                // Печать Horses
                Print.horses();
                break;
            case 15:
                // Печать Donkeys
                Print.donkeys();
                break;
            case 16:
                // Печать Camels
                Print.camels();
                break;
            case 2:
                // Печать количества всех животных
                Print.animalCount();
                break;
            case 3:
                // Ввод нового животного
                Run.newAnimal();
                break;
            case 4:
                // Ввод новой команды для животного
                Scanner in = new Scanner(System.in);
                System.out.print("Введите имя животного: ");
                String name = in.nextLine();
                System.out.print("Введите название новой команды: ");
                String cmd = in.nextLine();
                Run.newCommand(name, cmd);
                break;
            case 5:
                // Очистить экран
                Run.menu();
                break;
            case 6:
                // Выход из программы
                break;
            default:
                // Выбор неверной команды
                System.out.println("Вы ввели неправильную команду!");
                break;
        }
            cmdItem = Run.selMenu();
        }
        Run.exit();

        // Методы
        // ================================
        // Run.inputData();                        // Ввод начальных данных
        // Run.menu();                             // Печать меню программы
        // Run.selMenu();                          // Выбор действия
        // Print.allAnimals                        // Печать всех животных
        // Print.cats();                           // Печать Cats
        // Print.dogs();                           // Печать Dogs
        // Print.hamsters();                       // Печать Hamsters
        // Print.horses();                         // Печать Horses
        // Print.donkeys();                        // Печать Donkeys
        // Print.camels();                         // Печать Camels
        // Print.animalCount();                    // Печать количества всех животных
        // Run.newCommand("name", "newCommand");   // Новая команда для животного
        // Run.newAnimal("animal", "name",
        // "newCommand");                          // Новое животное
        // Run.exit();                             // Выход из программы

    }

}

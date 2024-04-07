package org.example.Animal.controller;

import org.example.Animal.model.*;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Run {
    // Создаем Массивы cats, dogs, hamters, horses, donkeys, camels
    public static ArrayList<Cat> cats = new ArrayList<>();
    public static ArrayList<Dog> dogs = new ArrayList<>();
    public static ArrayList<Hamster> hamsters = new ArrayList<>();
    public static ArrayList<Horse> horses = new ArrayList<>();
    public static ArrayList<Donkey> donkeys = new ArrayList<>();
    public static ArrayList<Camel> camels = new ArrayList<>();


    // Ввод начальных данных
    public static void inputData() {
        // Заполняе Массив cats
        cats.add(new Cat("Whiskers", "2019-05-09", new ArrayList<>()));
        cats.add(new Cat("Smudge", "2020-02-20", new ArrayList<>()));
        cats.add(new Cat("Oliver", "2020-06-30", new ArrayList<>()));
        // Команды cats
        cats.get(0).myCommands.add("Sit, Pounce");
        cats.get(1).myCommands.add("Sit, Pounce, Scratch");
        cats.get(2).myCommands.add("Meow, Scratch, Jump");
        // Заполняе Массив dogs
        dogs.add(new Dog("Fido", "2020-01-01", new ArrayList<>()));
        dogs.add(new Dog("Buddy", "2018-12-10", new ArrayList<>()));
        dogs.add(new Dog("Bella", "2019-11-11", new ArrayList<>()));
        // Команды dogs
        dogs.get(0).myCommands.add("Sit, Stay, Fetch");
        dogs.get(1).myCommands.add("Sit, Paw, Bark");
        dogs.get(2).myCommands.add("Sit, Stay, Roll");
        // Заполняе Массив humsters
        hamsters.add(new Hamster("Hammy", "2021-03-10", new ArrayList<>()));
        hamsters.add(new Hamster("Peanut", "2021-08-01", new ArrayList<>()));
        // Команды dogs
        hamsters.get(0).myCommands.add("Roll, Hide");
        hamsters.get(1).myCommands.add("Roll, Spin");
        // Заполняем Массив horses
        horses.add(new Horse("Thunder", "2015-07-21", new ArrayList<>()));
        horses.add(new Horse("Storm", "2014-05-05", new ArrayList<>()));
        horses.add(new Horse("Blaze", "2016-02-29", new ArrayList<>()));
        // Команды horses
        horses.get(0).myCommands.add("Trot, Canter, Gallop");
        horses.get(1).myCommands.add("Trot, Canter");
        horses.get(2).myCommands.add("Trot, Jump, Gallop");
        // Заполняем Массив donkeys
        donkeys.add(new Donkey("Eeyore", "2017-09-18", new ArrayList<>()));
        donkeys.add(new Donkey("Burro", "2019-01-23", new ArrayList<>()));
        // Команды horses
        donkeys.get(0).myCommands.add("Walk, Carry Load, Bray");
        donkeys.get(1).myCommands.add("Walk, Bray, Kick");
        // Заполняем Массив camels
        camels.add(new Camel("Sandy", "2016-11-03", new ArrayList<>()));
        camels.add(new Camel("Dune", "2018-12-12", new ArrayList<>()));
        camels.add(new Camel("Sahara", "2015-08-14", new ArrayList<>()));
        // Команды horses
        camels.get(0).myCommands.add("Walk, Carry Load");
        camels.get(1).myCommands.add("Walk, Sit");
        camels.get(2).myCommands.add("Walk, Run");
    }
    //================================================

    // Новая команда
    public static void newCommand(String name, String cmd) {
        Boolean writed = false;
        // Проверка имен cats
        for (int i = 0; i < cats.size(); i++) {
            if (Objects.equals(cats.get(i).getName(), name)) {
                cats.get(i).myCommands.add(cmd);
                writed = true;
            }
        }
        // Проверка имен dogs
        for (int i = 0; i < dogs.size(); i++) {
            if (Objects.equals(dogs.get(i).getName(), name)) {
                dogs.get(i).myCommands.add(cmd);
                writed = true;
            }
        }
        // Проверка имен hamsters
        for (int i = 0; i < hamsters.size(); i++) {
            if (Objects.equals(hamsters.get(i).getName(), name)) {
                hamsters.get(i).myCommands.add(cmd);
                writed = true;
            }
        }
        // Проверка имен horses
        for (int i = 0; i < horses.size(); i++) {
            if (Objects.equals(horses.get(i).getName(), name)) {
                horses.get(i).myCommands.add(cmd);
                writed = true;
            }
        }
        // Проверка имен donkeys
        for (int i = 0; i < donkeys.size(); i++) {
            if (Objects.equals(donkeys.get(i).getName(), name)) {
                donkeys.get(i).myCommands.add(cmd);
                writed = true;
            }
        }
        // Проверка имен camels
        for (int i = 0; i < camels.size(); i++) {
            if (Objects.equals(camels.get(i).getName(), name)) {
                camels.get(i).myCommands.add(cmd);
                writed = true;
            }
        }
        // Сообщение о записи команды
        if (writed) {
            System.out.println("Команда " + '\'' + cmd + '\'' + " для " +
                    '\'' + name + '\'' + " успешно добавлена в список команд!");
        } else {
            System.out.println("Животное под именем " +
                    '\'' + name + '\'' + " НЕТ в списке животных!");
            System.out.println("Введите правильно имя животного!");
        }

    }
    //================================================

    // Меню
    public static void menu() {
        //
        System.out.println("\f");
        System.out.println("====================================================");
        System.out.println("|            1. Печать списка животных             |");
        System.out.println("|               11 Печать списка Cats              |");
        System.out.println("|               12 Печать списка Dogs              |");
        System.out.println("|               13 Печать списка Hamsters          |");
        System.out.println("|               14 Печать списка Horses            |");
        System.out.println("|               15 Печать списка Donkeys           |");
        System.out.println("|               16 Печать списка Camels            |");
        System.out.println("|            2. Печать количества всех животных    |");
        System.out.println("|            3. Ввод нового животного              |");
        System.out.println("|            4. Ввод новой команды для животного   |");
        System.out.println("|            5. Очистить экран                     |");
        System.out.println("|            6. Выход из программы                 |");
        System.out.println("====================================================");
    }
    //================================================

    // Ввод команды
    public static int selMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите команду: ");
        int number = scanner.nextInt();
        return number;
    }
    // Выход из программы
    public static void exit() {
        System.out.println("\f");
        System.out.println("--------------------------------");
        System.out.println("Вы завершили работу с программой");
        System.out.println("--------------------------------");
    }
    // Новое животное
    public static void newAnimal() {
        /*
        anim - Вид животного (cat-1, dog-2, hamster-3, horse-4, donkey-5, camel-6)
        name - Название животного
        bthd - Дата рождения животного
        cmd - Команды исполняемые животным (если более 2-х, указать через запятую)
        */
        // Ввод нового животного
        Scanner inNewAnim = new Scanner(System.in);
        System.out.println("Введите вид животного (цифрой)");
        System.out.print("(cat-1, dog-2, hamster-3, horse-4, donkey-5, camel-6): ");
        String newAnim = inNewAnim.nextLine();
        System.out.print("Введите имя животного: ");
        String newAnimName = inNewAnim.nextLine();
        System.out.println("Введите дату рождения животного");
        System.out.print("в формате ГГГГ-ММ-ДД: ");
        String newAnimBthd = inNewAnim.nextLine();
        System.out.println("Введите команды исполняемые животным");
        System.out.print("Указать только одну команду (!): ");
        String newAnimcmd = inNewAnim.nextLine();
        // Выбор вида животного
        String newAnimType = "";
        String newAnimMsg = "";
        int erNum = 0;
        switch (newAnim) {
            case "1":
                newAnimType = "Cat";
                break;
            case "2":
                newAnimType = "Dog";
                break;
            case "3":
                newAnimType = "Hamster";
                break;
            case "4":
                newAnimType = "Horse";
                break;
            case "5":
                newAnimType = "Donkey";
                break;
            case "6":
                newAnimType = "Camel";
                break;
            default:
                newAnimType = "Вы ввели неверный вид животных";
                erNum = 1;
                break;
        }
        // Запись животного в список
        if (erNum == 0) {
            // new Cat
            if (newAnimType == "Cat") {
                cats.add(new Cat(newAnimName, newAnimBthd, new ArrayList<>()));
                int typeCount = cats.size();
                cats.get(typeCount - 1).myCommands.add(newAnimcmd);
            }
            // new Dog
            if (newAnimType == "Dog") {
                dogs.add(new Dog(newAnimName, newAnimBthd, new ArrayList<>()));
                int typeCount = dogs.size();
                dogs.get(typeCount - 1).myCommands.add(newAnimcmd);
            }
            // new Hamster
            if (newAnimType == "Hamster") {
                hamsters.add(new Hamster(newAnimName, newAnimBthd, new ArrayList<>()));
                int typeCount = hamsters.size();
                hamsters.get(typeCount - 1).myCommands.add(newAnimcmd);
            }
            // new Horse
            if (newAnimType == "Horse") {
                horses.add(new Horse(newAnimName, newAnimBthd, new ArrayList<>()));
                int typeCount = horses.size();
                horses.get(typeCount - 1).myCommands.add(newAnimcmd);
            }
            // new Donkey
            if (newAnimType == "Donkey") {
                donkeys.add(new Donkey(newAnimName, newAnimBthd, new ArrayList<>()));
                int typeCount = donkeys.size();
                donkeys.get(typeCount - 1).myCommands.add(newAnimcmd);
            }
            // new Camel
            if (newAnimType == "Camel") {
                camels.add(new Camel(newAnimName, newAnimBthd, new ArrayList<>()));
                int typeCount = camels.size();
                camels.get(typeCount - 1).myCommands.add(newAnimcmd);
            }

        }

    }
    //================================================

}

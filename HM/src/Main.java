import Animals.*;

import java.text.spi.NumberFormatProvider;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import Animals.birds.Duck;
import Data.Commands;
import Data.AnimalsData;
import Exception.AgeException;
import Exception.WeightException;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.year;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static int AgeException() {

            System.out.println("Введите возраст животного:");
            int age;
            try {
                age = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Необходимо ввести числовое значение");
                scanner.nextLine();
                age = AgeException();

            }
            if (age > 25 || age <= 0) {
                System.out.println("Неверно указан возраст животного! Попробуйте еще раз");
                scanner.nextLine();
                age = AgeException();
            }

            return age;
        }

    public static double itsWeight(){
        System.out.println("Введите вес животного:");
        double weight;
        try {
            weight = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Необходимо ввести числовое значение");
            scanner.nextLine();
            weight = itsWeight();
        }
        if(weight > 50 || weight <= 0){
            System.out.println("Неверно указан вес! Попробуйте еще раз");
            scanner.nextLine();
            weight = itsWeight();
        }
        return weight;


        }
        public static void main(String[] args) throws AgeException, WeightException {

            List<Animal> animals = new ArrayList<>();

        while (true) {
            System.out.println("Введите команду ADD/LIST/EXIT");
            String commInput = scanner.nextLine().trim().toUpperCase();
            Commands commands;
            try {
                commands = Commands.valueOf(commInput);
            } catch (IllegalArgumentException exception) {
                System.out.println("Неверная команда! Попробуйте еще раз");
                continue;
            }


            switch (commands) {
                case ADD: {
                    System.out.println("Введите название животного: cat/dog/duck");
                    String type = scanner.nextLine().trim().toLowerCase();

                    if (!type.equals("cat") && !type.equals("dog") && !type.equals("duck")) {
                        System.out.println("Неверный тип животного! Попробуйте еще раз");
                        continue;
                    }

                    System.out.println("Введите имя животного");
                    String name = scanner.nextLine().trim().toLowerCase();

                    int age = AgeException();
                    scanner.nextLine();
                    double weight = itsWeight();
                    scanner.nextLine();
                    System.out.println("Введите цвет животного");
                    String color = scanner.nextLine().trim().toLowerCase();

                    switch (type) {
                        case "cat":
                            animals.add(new Cat(name, age, color, weight));
                            new Cat(name, age, color, weight).say();
                            break;
                        case "dog":
                            animals.add(new Dog(name, age, color, weight));
                            new Dog(name, age, color, weight).say();
                            break;
                        case "duck":
                            animals.add(new Duck(name, age, color, weight));
                            new Duck(name, age, color, weight).say();
                            break;
                    }
                    break;
                }

                case LIST: {
                    if (animals.isEmpty()) {
                        System.out.println("Список животных пуст! Добавьте животное через команду ADD");
                    } else {
                        for (Animal animal : animals) {
                            System.out.println(animal.toString(animal.name, animal.age, animal.weight, animal.color));
                        }
                    }
                    break;
                    }
                case EXIT: {
                    scanner.close();
                    System.out.println("Выход из программы");
                    System.exit(0);
                }
            }
        }
    }
}







package Animals;
import Exception.*;
import Animals.Animal;


public class Cat extends Animal {

    public Cat(String name, int age, String color, double weight) throws AgeException, WeightException {
        super(name, age, weight, color);
    }

        public void say() {
            System.out.println("Мяу");
        }
    }


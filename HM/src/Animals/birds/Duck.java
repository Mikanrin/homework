package Animals.birds;

import Exception.*;
import Animals.Animal;

public class Duck extends Animal implements Flying {

    public Duck(String name, int age, String color, double weight) throws AgeException, WeightException{
        super(name, age, weight, color);
    }

    public void fly() {
        System.out.println("Я лечу");
    }
    public void say() {
        System.out.println("Кря");
    }
}


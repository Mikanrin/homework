package Animals;
import Exception.*;
import Animals.Animal;

public class Dog extends Animal{

    public Dog(String name, int age, String color, double weight) throws AgeException, WeightException{
        super(name, age, weight, color);
    }
    public void say() {
        System.out.println("Гав");
    }
}

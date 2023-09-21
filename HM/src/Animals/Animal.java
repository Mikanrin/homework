package Animals;
import Exception .*;


import sun.security.x509.OtherName;

public class Animal {
    public String name;
    public int age;
    public double weight;
    public String color;



    public Animal (String name, int age, double weight, String color) throws AgeException, WeightException {


        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() throws AgeException {
        if (age > 30) {
            throw new AgeException(age);
        }

        {
            return age;
        }
    }
        public void setAge (int age)
        {
            this.age = age;
        }
        public double getWeight ()
        {
            return weight;
        }

        public void setWeight ( double weight){
            this.weight = weight;
        }

        public String getColor () {
            return color;
        }

        public void setColor (String color){
            this.color = color;
        }


        public void say () {
            System.out.println("Я говорю");
        }

        public void go () {
            System.out.println("Я иду");
        }

        public void drink () {
            System.out.println("Я пью");
        }

        public void eat () {
            System.out.println("Я ем");
        }

        public String toString(String name, int age, double weight, String color) {

            return String.format("Привет! Меня зовут "+ name+", мне " + age +" "+ year(age)+", я вешу - "+weight+" кг, мой цвет - "+color, name, age, year(age), weight, color);

        }

        public String year (int age){
            String years = "";
            int ages = this.age % 10;

            if (this.age >= 11 && this.age <= 19) {
                years = "лет";
            }

            if (age == 1) {
                years = "год";
            } else if (age > 5) {
                years = "лет";
            } else {
                years = "года";
            }
            return years;
        }

    }

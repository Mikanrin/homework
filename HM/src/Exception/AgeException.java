package Exception;

public class AgeException extends Exception {

    public AgeException(int age)
    {
        super(String.format("Возраст животного не может быть %d,", age));
    }
}

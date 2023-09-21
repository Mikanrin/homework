package Exception;

public class WeightException extends Exception {

    public WeightException (double weight){
        super(String.format("Вес животного не может быть отрицательным или равняться нулю"));
    }
}

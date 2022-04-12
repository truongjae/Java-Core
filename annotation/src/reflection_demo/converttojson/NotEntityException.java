package reflection_demo.converttojson;

public class NotEntityException extends RuntimeException{
    public NotEntityException(String message) {
        System.out.println(message);
    }
}
